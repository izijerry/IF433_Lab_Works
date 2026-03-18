package oop_00000114034_AdmiralAlFariziBahri_week07.tugas

enum class ItemRarity(val dropChance: Int) {
    COMMON(50),
    UNCOMMON(25),
    RARE(15),
    EPIC(7),
    LEGENDARY(3)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)