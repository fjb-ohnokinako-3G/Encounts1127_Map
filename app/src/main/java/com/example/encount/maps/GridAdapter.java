package com.example.encount.maps;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.encount.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static android.content.Context.WINDOW_SERVICE;


public class GridAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private int layoutId;
    private List<String> imageList = new ArrayList<>();

    private int ScreenWHalf = 0;

    GridAdapter(Context context, int layoutId, String[] iList) {
        super();
        this.context = context;
        this.inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.layoutId = layoutId;

        Collections.addAll(imageList, iList);

        // 画面の横幅の半分を計算
        WindowManager wm = (WindowManager)
                context.getSystemService(WINDOW_SERVICE);
        if(wm != null){
            Display disp = wm.getDefaultDisplay();
            Point size = new Point();
            disp.getSize(size);

            int screenWidth = size.x;
            ScreenWHalf = screenWidth/2;
            Log.d("debug","ScreenWidthHalf="+ScreenWHalf);
        }

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            view = inflater.inflate(layoutId, parent, false);
        } else {
            view =  convertView;
        }

        ImageView img = view.findViewById(R.id.image_view);
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);

        Picasso.with(context)
                .load(addUrl(position))
                .resize(ScreenWHalf, ScreenWHalf)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(img);

        return view;
    }

    // ネットワークアクセスするURLを設定する
    private String addUrl(int number){

        return String.format(Locale.US,
                "https://kinako.cf/files/postImg/%s.jpg",// 自分のサーバーに上げて見ましょう
                imageList.get(number));
    }

    @Override
    public int getCount() {
        // 全要素数を返す
        return imageList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}