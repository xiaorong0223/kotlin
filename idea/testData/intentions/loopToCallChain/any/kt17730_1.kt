// WITH_RUNTIME
// INTENTION_TEXT: "Replace with 'any{}'"
fun foo(): Boolean {
    val list = listOf(1, 2, 3, 4, 5)
    <caret>for (e in list) {
        if (!(e <= 3)) {
            return true
        }
    }
    return false
}
