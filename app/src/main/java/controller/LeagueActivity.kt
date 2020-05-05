package controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_leaugue_.*
import model.Player
import utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {



    var player=Player( "","")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_leaugue_)
    }

    fun onmensclicked(view: View) {
        womensLeaguebtn.isChecked = false
        coedLeaguebtn.isChecked = false
        player.league = "mens"


    }

    fun onwomensclicked(view: View) {
        mensLeaguebtn.isChecked = false
        coedLeaguebtn.isChecked = false
        player.league = "womens"
    }

    fun oncoedclicked(view: View) {
        mensLeaguebtn.isChecked = false
        womensLeaguebtn.isChecked = false
        player.league = "coed"

    }

    fun leaguenxtclicked(view: View) {
        if (player.league!= "") {


            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "please select a league.", Toast.LENGTH_SHORT).show()
        }


    }
}