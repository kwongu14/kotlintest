fun main() {
    var str1: String? = "hello"
    str1 = "kill"
    println("str1: $str1 length: ${str1?.length ?: -1}")

    val resuit = 1L + 3
    println("resuit: $resuit")

}
fun main() {
    checkArg("hello")
    checkArg(5)
}

