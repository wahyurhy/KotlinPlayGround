fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddNumber = mutableListOf<Int>()
    for (num in number) {
        if (num % 2 == 1) {
            oddNumber.add(num)
        }
    }

    print(oddNumber)
}