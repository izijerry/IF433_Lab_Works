package oop_00000114034_AdmiralAlFariziBahri_Week04

open class Vehicle(val brand:String){
    var speed:Int = 0

    open fun accelerate(){
        speed += 10
        println("$brand melaju. Kecepatan $speed km/jam")
    }

    open fun honk(){
        println("beep!!!")
    }
}