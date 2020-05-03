package controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_leaugue_.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_leaugue_)
    }

    fun onmensclicked(view: View) {
        womensLeaguebtn.isChecked = false
        coedLeaguebtn.isChecked = false
        selectedLeague = "mens"


    }

    fun onwomensclicked(view: View) {
        mensLeaguebtn.isChecked = false
        coedLeaguebtn.isChecked = false
        selectedLeague = "womens"
    }

    fun oncoedclicked(view: View) {
        mensLeaguebtn.isChecked = false
        womensLeaguebtn.isChecked = false
        selectedLeague = "coed"

    }

    fun leaguenxtclicked(view: View) {
        if (selectedLeague != "") {


            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "please select a league.", Toast.LENGTH_SHORT).show()
        }


    }
}