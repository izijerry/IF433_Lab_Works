package oop_00000114034_AdmiralAlFariziBahri_week07.tugas

class Weapon private constructor (val item: GameItem, val durability: Int){
    companion object {
        fun forgeStarterSword(): Weapon{
            val item = GameItem("pedang kayu", 10, ItemRarity.COMMON)
            return Weapon(item, 50)
        }
        fun forgeEpicSword(): Weapon{
            val item = GameItem("Samurai", 100, ItemRarity.EPIC
            )
            return Weapon(item, 200)
        }
    }
}