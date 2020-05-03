@file:Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")

package controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*
import utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {
    var league=""
    var skill=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league= intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

            fun onballerclick(view: View){
                beginnerskillbtn.isChecked=false
                skill="baller"
            }

            fun onbeginnerclick(view: View){
                ballerskillbtn.isChecked=false
                skill="beginner"
            }

             fun onskillfinishclicked(view:View){
                 if(skill !="")
                 {
                     val finishactivity= Intent(this,FinishActivity::class.java)
                     finishactivity.putExtra(EXTRA_LEAGUE,league)
                     finishactivity.putExtra(EXTRA_SKILL,skill)
                startActivity(finishactivity)
            }
             else{
                   Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
                 }


             }



}
