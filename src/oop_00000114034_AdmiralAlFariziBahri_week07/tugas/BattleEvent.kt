package oop_00000114034_AdmiralAlFariziBahri_week07.tugas

sealed class BattleState {
    data class MonsterEncounter(val monsterName: String) : BattleState()

    data class LootDropped(val item: GameItem) : BattleState()

    data class GameOver(val reason: String) : BattleState()

    object SafeZone : BattleState()
}