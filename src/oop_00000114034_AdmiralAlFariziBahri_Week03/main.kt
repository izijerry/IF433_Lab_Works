package oop_00000114034_AdmiralAlFariziBahri_Week03

fun main(){
    val e = Employee("budi")

    e.salary = -1000
    e.salary = 500000
    println("gaji: ${e.salary}")

    e.increasePerformance()

    println("pajak yang harus di bayar: ${e.tax}")
}