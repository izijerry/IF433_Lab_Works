package oop_00000114034_AdmiralAlFariziBahri_Week04

class Car (brand:String, val numberOfDoors: Int) :Vehicle(brand) {
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibukua.")
    }

    override fun honk(){
        println("tin tin tin mobil $brand lewat")
    }

    override fun accelerate(){
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")

    }
}