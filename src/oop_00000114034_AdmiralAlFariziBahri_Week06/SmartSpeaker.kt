package oop_00000114034_AdmiralAlFariziBahri_Week06

class SmartSpeaker(override val id: String, override var name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name turn on")
    }

    override fun turnOff() {
        println("$name turn off")
    }

    fun playMusic(song: String){
        println("memutar lagu $song dari spotify")
    }
}