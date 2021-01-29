package com.example.smartcloset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View.OnClickListener;


public class StartActivity extends AppCompatActivity implements OnClickListener {

    ImageButton shirts_bt, tshirt_bt, sweater_bt, vest_bt;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //이미지뷰를 버튼에 넣어 속성 사용하기 위한 구문
        shirts_bt = (ImageButton)findViewById(R.id.shirts_button);
        tshirt_bt = (ImageButton)findViewById(R.id.tshirt_button);
        sweater_bt = (ImageButton)findViewById(R.id.sweater_button);
        vest_bt = (ImageButton)findViewById(R.id.vest_button);

        //버튼에 클릭 이벤트 처리
        shirts_bt.setOnClickListener(this);
        tshirt_bt.setOnClickListener(this);
        sweater_bt.setOnClickListener(this);
        vest_bt.setOnClickListener(this);

        //xml에 불러운 이미지뷰를 iv에 넣어 속성 사용하기 위한 구문
        iv = (ImageView)findViewById(R.id.top_view);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shirts_button:
                //이미지뷰에 사진을 출력하는 구문
                iv.setImageResource(R.drawable.shirts);
                break;
            case R.id.tshirt_button:
                //이미지뷰에 사진을 출력하는 구문
                iv.setImageResource(R.drawable.tshirt);
                break;
            case R.id.sweater_button:
                //이미지뷰에 사진을 출력하는 구문
                iv.setImageResource(R.drawable.sweater);
                break;
            case R.id.vest_button:
                //이미지뷰에 사진을 출력하는 구문
                iv.setImageResource(R.drawable.vest);
                break;
        }
    }
}