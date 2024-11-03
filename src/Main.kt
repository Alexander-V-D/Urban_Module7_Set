fun main() {

    //Задача 1
    val set1 = setOf(1, 2, 3, 4, 5)
    val oddSet = mutableSetOf<Int>()
    val evenSet = mutableSetOf<Int>()
    set1.forEach { if (it % 2 == 0) evenSet.add(it) else oddSet.add(it) }
    println("Пример работы решения задачи 1:")
    println("Набор нечетных чисел: $oddSet\nНабор четных чисел: $evenSet")

    //Задача 2
    val set2 = setOf(1, 2, 3, 4, 5)
    val x2Set = mutableSetOf<Int>()
    set2.forEach { if (it * 2 % 5 == 0) x2Set.add(it * 2) }
    println("Пример работы решения задачи 2: $x2Set")

    //Задача 3
    val set3 = removeDuplicates(listOf(1, 2, 3, 4, 1, 2, 3, 4))
    println("Пример работы решения задачи 3: $set3")

    //Задача 4
    val array = arrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)
    var resultArray = arrayOf<Int>()
    array.forEach { if (it != 0) resultArray += it }
    array.forEach { if (it == 0) resultArray += 0}
    println("Пример работы решения задачи 4: ${resultArray.contentToString()}")
}

fun <T> removeDuplicates(collection: Collection<T>?) = collection?.toSet()