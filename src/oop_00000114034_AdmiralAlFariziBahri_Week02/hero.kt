package oop_00000114034_AdmiralAlFariziBahri_Week02

class Hero (val name: String, val baseDamage: Int, var hp: Int = 100){
    fun attack(target: String){
        println("$name menebas $target!")
    }

    fun takeDamage(damage: Int){
        hp -= damage

        if (hp < 0){
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}

