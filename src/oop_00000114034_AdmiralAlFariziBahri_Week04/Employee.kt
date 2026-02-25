package oop_00000114034_AdmiralAlFariziBahri_Week04

open class Employee (val name: String, val baseSalary: Int) {
    open fun work(){
        println("$name sedang berkerja")
    }

    open fun calculateBonus(): Int{
        return (baseSalary*0.1).toInt()
    }

}