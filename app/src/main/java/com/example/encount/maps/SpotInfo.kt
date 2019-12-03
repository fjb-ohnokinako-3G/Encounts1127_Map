package com.example.encount.maps

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.encount.R
import com.example.encount.user.UserProfile

/**
 * スポット詳細表示画面
 * このクラスでは、マップ上で任意のスポットをタップした場合に遷移する画面。
 */

class SpotInfo  : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_spotinfo)


        //val menuUserBtn = findViewById<LinearLayout>
        val SpotPopular = findViewById<LinearLayout>(R.id.SpotPopular)

        SpotPopular.setOnClickListener {

            startActivity(Intent(this, UserProfile::class.java))
            overridePendingTransition(0, 0)
        }

    }
}