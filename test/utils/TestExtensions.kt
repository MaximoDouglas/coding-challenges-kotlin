package utils

fun String.getIntArrayFromSpaceSeparatedString(): Array<Int> {
    return this.split(" ").map { it.toInt() }.toTypedArray()
}