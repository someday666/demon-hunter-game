package com.demonhunter

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.demonhunter.combat.CombatEngine
import com.demonhunter.core.GameState

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val info = TextView(this)
        val btn = Button(this)

        btn.text = "ATTACK"

        btn.setOnClickListener {
            CombatEngine.hitEnemy()
            update(info)
        }

        layout.addView(info)
        layout.addView(btn)

        setContentView(layout)

        update(info)
    }

    fun update(text: TextView) {
        text.text =
            "Floor: ${GameState.floor}\n" +
            "Enemy HP: ${GameState.enemyHP}\n" +
            "Gold: ${GameState.gold}"
    }
}