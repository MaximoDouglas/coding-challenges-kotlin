package challenges.challenges

import java.util.*

// https://www.hackerrank.com/challenges/balanced-brackets/

fun isBalanced(s: String): String {
    val bracketsStack = Stack<Char>()

    s.forEach {
        when (it) {
            ')' -> {
                if (bracketsStack.isNotEmpty() && bracketsStack.peek() == '(') {
                    bracketsStack.pop()
                } else {
                    return "NO"
                }
            }

            '}' -> {
                if (bracketsStack.isNotEmpty() && bracketsStack.peek() == '{') {
                    bracketsStack.pop()
                } else {
                    return "NO"
                }
            }

            ']' -> {
                if (bracketsStack.isNotEmpty() && bracketsStack.peek() == '[') {
                    bracketsStack.pop()
                } else {
                    return "NO"
                }
            }

            else -> bracketsStack.push(it)
        }
    }

    return "YES".takeIf { bracketsStack.isEmpty() } ?: "NO"
}