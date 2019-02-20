package com.tutoruservice.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tutoruservice.swoosh.Model.Player
import com.tutoruservice.swoosh.R
import com.tutoruservice.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra(EXTRA_PLAYER) as Player

        searchLeaguesText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
