package oop_00000114034_AdmiralAlFariziBahri_week07.tugas

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}")

    val starterWeapon = Weapon.forgeStarterSword()
    println(starterWeapon.item)
    println("Durability: ${starterWeapon.durability}")
}