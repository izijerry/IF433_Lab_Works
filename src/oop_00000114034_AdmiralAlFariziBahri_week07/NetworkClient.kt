package oop_00000114034_AdmiralAlFariziBahri_week07

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url")
    }
}