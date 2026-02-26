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

    println("\n --- testing electric car ---")
    val ecar = ElectricCar("wuling", 4, 90)
    ecar.accelerate()

    println("\n --- testing manager ---")
    val mngr = Manager("joni", 2500000)
    mngr.work()
    mngr.calculateBonus()

    println("\n --- testing developer ---")
    val dev = Developer("jim", 5000000, "C")
    dev.work()
    dev.calculateBonus()

}