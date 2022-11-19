fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddNumber = number.filter { it % 2 == 1 }
    println(oddNumber)

    println("count of oddNumber ${oddNumber.count()}")
}