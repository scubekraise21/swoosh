@file:Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")

package controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*
import model.Player
import utilities.EXTRA_PLAYER

class SkillActivity : BaseActivity() {
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player= intent.getParcelableExtra(EXTRA_PLAYER)

    }

            fun onballerclick(view: View){
                beginnerskillbtn.isChecked=false
                player.skill="baller"
            }

            fun onbeginnerclick(view: View){
                ballerskillbtn.isChecked=false
                player.skill="beginner"
            }

             fun onskillfinishclicked(view:View){
                 if(player.skill!="")
                 {
                     val finishactivity= Intent(this,FinishActivity::class.java)
                     finishactivity.putExtra(EXTRA_PLAYER,player)

                startActivity(finishactivity)
            }
             else{
                   Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
                 }


             }



}
