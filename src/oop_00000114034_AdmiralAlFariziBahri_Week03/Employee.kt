package oop_00000114034_AdmiralAlFariziBahri_Week03

class Employee(val name: String){
    var salary:Int = 0
    set(value) {
        if(value < 0){
            println("gaji tidak boleh negatif")
            field = 0
        }else{
            field = value
        }

    }


    private var performanceRating:Int = 3

    fun increasePerformance(){
        performanceRating ++
        println("kinjera ${name} meningkat rating: $performanceRating")
    }

    fun printStatus(){
        println("nama: ${name} rating: ${performanceRating}")
    }

    val tax:Double
        get() = salary*0.1
}