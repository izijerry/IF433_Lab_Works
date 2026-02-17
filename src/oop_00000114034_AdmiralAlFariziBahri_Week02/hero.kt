package oop_00000114034_AdmiralAlFariziBahri_Week02

class Hero (val name: String, var hp: Int = 100, val baseDamage: Int){
    fun attack(target: String){
        println("$name menebas $target!")
    }

    fun takeDamage(damage: Int){
        hp -= baseDamage

        if (hp < 0){
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}

fun main(){

}