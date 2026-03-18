package oop_00000114034_AdmiralAlFariziBahri_week07.tugas

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if(isGameRunning == true){
            println("game sudah berjalan! Mencegah instansiasi ganda")
        }else{
            isGameRunning = true
            println("memulai game engine...")
        }

    }
}