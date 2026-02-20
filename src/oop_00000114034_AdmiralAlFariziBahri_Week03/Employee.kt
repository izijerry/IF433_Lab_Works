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
}