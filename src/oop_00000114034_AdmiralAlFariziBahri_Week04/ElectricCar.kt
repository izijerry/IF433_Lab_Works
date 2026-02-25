package oop_00000114034_AdmiralAlFariziBahri_Week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. kapasitas baterai: $batteryCapacity%")
    }
}