package com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.swoosh.R

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_leaugue_)
    }

    fun leaguenxtclicked(view:View){
        val skillActivity= Intent(this,SkillActivity::class.java)
        startActivity(skillActivity)
    }
}
