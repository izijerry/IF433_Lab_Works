package oop_00000114034_AdmiralAlFariziBahri_Week06

class Smartwatch: Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime(){
        println("Layar Oled menyala: 14:00 wib")
    }

    override fun connectToBluetooth() {
        println("mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("mengisi daya menggunakan charger magnetik 15W.")
    }

}