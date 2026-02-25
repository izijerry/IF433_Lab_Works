package oop_00000114034_AdmiralAlFariziBahri_Week04

fun main(){
    println("--- testing vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n --- testing car ---")
    val mycar = Car("toyota", 4)
    mycar.openTrunk()
    mycar.honk()
    mycar.accelerate()

    val ecar = ElectricCar("wuling", 4, 90)
    ecar.accelerate()

}