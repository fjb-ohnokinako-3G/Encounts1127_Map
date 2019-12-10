package com.example.encount.maps

/*
Copyright 2013 Square, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
//AndroidX

import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.GridView
import android.widget.LinearLayout

import androidx.appcompat.app.AppCompatActivity

import com.example.encount.R
import com.example.encount.post.UserHome
import com.example.encount.user.UserProfile

//import android.support.v7.app.AppCompatActivity;

class SpotMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spotmain)

        // GridViewのインスタンスを生成
        val gridview = findViewById<GridView>(R.id.gridview)

        // BaseAdapter を継承したGridAdapterのインスタンスを生成
        val adapter = GridAdapter(
            this.applicationContext,
            R.layout.grid_items,
            photos
        )

        // gridViewにadapterをセット
        gridview.setAdapter(adapter)

        //画面遷移用
        val menuHomeBtn = findViewById<LinearLayout>(R.id.MenuHome)
        val menuUserBtn = findViewById<LinearLayout>(R.id.MenuUser)
        val SpotPopular = findViewById<LinearLayout>(R.id.SpotPopular)
    }

    companion object {

        private val photos = arrayOf(
            "5ddb4b39131fd",
            "1896915185_5de706dbed01f",
            "1697161281_5ddc933768fec",
            "1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7"
        )
    }


}
