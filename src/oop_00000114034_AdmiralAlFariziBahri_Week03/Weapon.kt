package oop_00000114034_AdmiralAlFariziBahri_Week03

class Weapon(val name:String) {
    var damage:Int = 0
        set(value) {
            if (value < 0){
                println("damage tidak boleh negatif")
            }else if (value > 1000){
                field = 1000
            }else{
                field = value
            }
        }

    var tier:String = ""
        get() {
            if(damage > 800){
                return ("Legendary")
            }else if (damage > 500){
                return ("Epic")
            }else{
                return ("Common")
            }
        }
}