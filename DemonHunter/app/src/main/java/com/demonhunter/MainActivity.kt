package com.demonhunter

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var enemy = 50
    var gold = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val text = TextView(this)
        val btn = Button(this)

        btn.text = "ATTACK"

        btn.setOnClickListener {
            enemy -= 10
            if (enemy <= 0) {
                gold += 10
                enemy = 50
            }
            text.text = "Enemy: $enemy\nGold: $gold"
        }

        layout.addView(text)
        layout.addView(btn)

        setContentView(layout)
    }
}
