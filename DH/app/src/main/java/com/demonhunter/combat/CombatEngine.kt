package com.demonhunter.combat

import com.demonhunter.core.GameState

object CombatEngine {

    fun hitEnemy() {
        GameState.enemyHP -= GameState.playerDamage

        if (GameState.enemyHP <= 0) {
            GameState.gold += 10
            GameState.floor += 1
            GameState.enemyHP = 50 + GameState.floor * 10
        }
    }
}