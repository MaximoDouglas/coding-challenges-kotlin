package challenges.challenges

// https://www.hackerrank.com/challenges/ctci-ransom-note/problem

fun checkMagazine(magazine: Array<String>, note: Array<String>): String {
    if (magazine.size >= note.size) {
        val noteWords = hashMapOf<String, Int>()

        note.forEach { word ->
            noteWords[word] = (noteWords[word] ?: 0) + 1
        }

        val magazineWords = hashMapOf<String, Int>()

        magazine.forEach { word ->
            magazineWords[word] = (magazineWords[word] ?: 0) + 1
        }

        if (magazineWords.size >= noteWords.size) {
            var answer = "Yes"

            noteWords.forEach { noteWordsEntry ->
                if ((magazineWords[noteWordsEntry.key] ?: 0) < noteWordsEntry.value) {
                    answer = "No"
                }
            }

            return answer
        } else {
            return "No"
        }
    } else {
        return "No"
    }
}