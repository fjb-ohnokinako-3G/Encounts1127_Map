package com.example.encount.maps;

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

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.encount.R;
import com.example.encount.post.UserHome;
import com.example.encount.user.UserProfile;

//import android.support.v7.app.AppCompatActivity;

public class SpotMainActivity extends AppCompatActivity {

    private static final String[] photos = {
            "5ddb4b39131fd", "1896915185_5de706dbed01f",
            "1697161281_5ddc933768fec","1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7","1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7","1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7","1858530768_5de645e06b5d7",
            "1858530768_5de645e06b5d7","1858530768_5de645e06b5d7",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spotmain);

        // GridViewのインスタンスを生成
        GridView gridview = findViewById(R.id.gridview);

        // BaseAdapter を継承したGridAdapterのインスタンスを生成
        GridAdapter adapter = new GridAdapter(
                this.getApplicationContext(),
                R.layout.grid_items,
                photos);

        // gridViewにadapterをセット
        gridview.setAdapter(adapter);

        //画面遷移用
        LinearLayout menuHomeBtn = findViewById(R.id.MenuHome);
        LinearLayout menuUserBtn = findViewById(R.id.MenuUser);
        LinearLayout SpotPopular = findViewById(R.id.SpotPopular);
    }

}
