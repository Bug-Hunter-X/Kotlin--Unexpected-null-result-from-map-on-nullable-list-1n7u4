fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) // Output: []

    val nullableList: List<Int>? = null
    val nullableResult = nullableList?.map { it * 2 } ?: emptyList()
    println(nullableResult) // Output: []
    
    val anotherNullableList: List<Int>? = listOf(1,2,3)
    val anotherResult = anotherNullableList?.map { it * 2 } ?: emptyList() 
    println(anotherResult) // Output: [2, 4, 6]
} 