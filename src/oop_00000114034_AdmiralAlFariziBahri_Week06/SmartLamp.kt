package oop_00000114034_AdmiralAlFariziBahri_Week06

class SmartLamp(override val id: String, override var name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("lampu $name dinyalakan ")
    }

    override fun turnOff() {
        println("lampu $name dimatikan ")
    }

}