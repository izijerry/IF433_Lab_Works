package oop_00000114034_AdmiralAlFariziBahri_week07.tugas

fun processEvent(event: BattleState) {
    when (event) {

        is BattleState.MonsterEncounter -> {
            println("Bertemu monster: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Mendapat loot: $name (Damage: $damage, Rarity: $rarity)")
        }

        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Berada di zona aman")
        }
    }
}