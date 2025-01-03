fun main() {

    /*
    Написать абстрактный класс «Службы экстренного реагирования».
    У него есть свой конструктор, содержащий свойства name и phone.
    Он содержит функцию, характеризующий его деятельность.
    Напишите интерфейс, который содержит функцию getDescription, дающую описание той или ной службы или организации.
    */
    val ambulance = Ambulance("Ambulance", "03")
    println(ambulance)
    ambulance.getDescription()
    val fireService = FireService("Fire Service", "01")
    println(fireService)
    fireService.getDescription()
    println()

    val A = 18
    val B = 48
    println("Вычисленный наибольший общий делитель $A и $B : " + calculatedGreatestCommonDivisor(A, B))
    println()

    val array = arrayOf(5, 8, 15, 4, 8, 30)
    println(array.contentDeepToString())
    println("Дан набор целых чисел. Найти второе максимальное число: " + findSecondMaximumNumber(array))

}

/*
Даны целые положительные числа A и B.
Найти их наибольший общий делитель (НОД), используя алгоритм Евклида: НОД(A,B) = НОД(B, A mod B), если B≠0; НОД(A, 0) = A.
*/
fun calculatedGreatestCommonDivisor(A: Int, B: Int): Int {
    var aTemp = A
    var bTemp = B
    while (bTemp != 0) {
        val temp = aTemp % bTemp
        aTemp = bTemp
        bTemp = temp
    }
    return aTemp
}

/*
Дан набор целых чисел. Найти второе максимальное число.
*/
fun findSecondMaximumNumber(array: Array<Int>): Int {
    val max = array.max()
    var maxTwo = 0
    for (a in array.indices) if (array[a] > maxTwo && array[a] != max) maxTwo = array[a]
    return maxTwo
}

/*
Примечания:
Для вывода значений на экран используйте функцию println().
*/