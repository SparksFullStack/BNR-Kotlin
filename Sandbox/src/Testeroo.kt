fun main(args: Array<String>) {
    val factResult: Int = firstFactorial(3)
    print(factResult)
}

fun firstFactorial(n: Int): Int {
    return if (n == 1) n
    else n * firstFactorial((n - 1))
}
