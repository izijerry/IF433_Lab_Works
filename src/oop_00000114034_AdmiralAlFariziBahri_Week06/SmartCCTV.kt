package oop_00000114034_AdmiralAlFariziBahri_Week06

class SmartCCTV(override val id: String, override var name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOff() {
        println("$name dimatikan")
    }

    override fun turnOn() {
        println("$name dinyalakan")
        startRecord()
    }

    override fun startRecord() {
        println("$name mulai merekam")
    }
}