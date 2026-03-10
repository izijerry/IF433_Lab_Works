package oop_00000114034_AdmiralAlFariziBahri_Week06

class Smartphone: Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("sistem operasi smartphone berhasil booting")
    }
}