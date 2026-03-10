package oop_00000114034_AdmiralAlFariziBahri_Week06

interface SmartDevice{
    val id: String
    var name:String
}

interface Switchable{
    fun turnOn()
    fun turnOff()
}

interface Recordable{
    fun startRecord()
    fun stopRecord(){
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }
}