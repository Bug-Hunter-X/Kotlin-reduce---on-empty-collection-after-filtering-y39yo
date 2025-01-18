fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 } 
                   .filter { it > 5 } 
                   .reduce { acc, i -> acc + i }
    println(result) //This will throw an exception if the list is empty after filtering
}