package com.example.encount.maps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.encount.R
import kotlinx.android.synthetic.main.activity_post_details.*

/**
 * やってること
 * 投稿の詳細な情報を表示する
 *
 * 製作者：菊地
 */

class SpotInfoDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_details)

        val postId = intent.getStringExtra("Post_Id")

        UserName.text = postId
    }
}