package oop_00000114034_AdmiralAlFariziBahri_Week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    var enemyHp = 100
    val enemyDamage = (1..10).random()

    print("masukan nama hero: ")
    val nama = scanner.nextLine()

    print("masukan stat damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(nama, damage)

    while(hero.isAlive() && enemyHp > 0){
        println("1. Serang\n2. Kabur")
        var choice = scanner.nextInt()

        if(choice == 1){
            enemyHp -= hero.baseDamage

            if(enemyHp > 0){
                hero.takeDamage(enemyDamage)
            }

            println("Hp anda ${hero.hp}")
        }else if(choice == 2){
            println("anda kabur...")
            break
        }
    }

    if(hero.hp > enemyHp){
        println("Pemenangnya adalah ${hero.name} dengan hp: ${hero.hp}")
    }else if(hero.hp == enemyHp){
        println("Pemenangnya adalah ${hero.name} & enemy dengan ${hero.name} hp: ${hero.hp} dan enemy hp: ${enemyHp}")
    }else{
        println("Anda kalah")
    }

}