package controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*
import model.Player
import utilities.EXTRA_PLAYER


class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player=intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text="Looking for ${player.league} ${player.skill} league near you......"


    }
}
