fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 } 
                   .filter { it > 5 }
                   .fold(0) { acc, i -> acc + i }
    println(result)

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.fold(0) { acc, i -> acc + i }
    println(emptyResult) //This will now print 0 instead of throwing an exception
}