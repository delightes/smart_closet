//2. 상의 화면
package com.example.smartcloset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;


public class StartActivity extends AppCompatActivity implements OnClickListener {

    ImageButton shirts_bt, tshirt_bt, sweater_bt, vest_bt;
    ImageButton skin_btn_1, skin_btn_2, skin_btn_3, skin_btn_4, skin_btn_5; // 피부색 버튼
    ImageButton hair_btn_1, hair_btn_2, hair_btn_3, hair_btn_4, hair_btn_5; // 머리 버튼
    ImageButton eye_btn_1, eye_btn_2, eye_btn_3, eye_btn_4; // 눈 버튼
    ImageButton mouth_btn_1, mouth_btn_2, mouth_btn_3, mouth_btn_4; // 입 버튼
    ImageView iv, skin_p, hair_view, eye_view, mouth_view;
    LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4, linearLayout5; // 레이아웃
    Button skin_button, hair_button, eye_button, mouth_button, top_button, bottom_button; // 상단버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //이미지뷰를 버튼에 넣어 속성 사용하기 위한 구문
        shirts_bt = (ImageButton)findViewById(R.id.shirts_button);
        tshirt_bt = (ImageButton)findViewById(R.id.tshirt_button);
        sweater_bt = (ImageButton)findViewById(R.id.sweater_button);
        vest_bt = (ImageButton)findViewById(R.id.vest_button);

        // 피부색 버튼
        skin_btn_1 = (ImageButton)findViewById(R.id.skin_btn_1);
        skin_btn_2 = (ImageButton)findViewById(R.id.skin_btn_2);
        skin_btn_3 = (ImageButton)findViewById(R.id.skin_btn_3);
        skin_btn_4 = (ImageButton)findViewById(R.id.skin_btn_4);
        skin_btn_5 = (ImageButton)findViewById(R.id.skin_btn_5);

        // 눈 버튼
        eye_btn_1 = (ImageButton) findViewById(R.id.eye_btn_1);
        eye_btn_2 = (ImageButton) findViewById(R.id.eye_btn_2);
        eye_btn_3 = (ImageButton) findViewById(R.id.eye_btn_3);
        eye_btn_4  = (ImageButton) findViewById(R.id.eye_btn_4);

        // 입 버튼
        mouth_btn_1 = (ImageButton) findViewById(R.id.mouth_btn_1);
        mouth_btn_2 = (ImageButton) findViewById(R.id.mouth_btn_2);
        mouth_btn_3 = (ImageButton) findViewById(R.id.mouth_btn_3);
        mouth_btn_4 = (ImageButton) findViewById(R.id.mouth_btn_4);

        //버튼에 클릭 이벤트 처리
        shirts_bt.setOnClickListener(this);
        tshirt_bt.setOnClickListener(this);
        sweater_bt.setOnClickListener(this);
        vest_bt.setOnClickListener(this);

        //xml에 불러운 이미지뷰를 iv에 넣어 속성 사용하기 위한 구문
        iv = (ImageView)findViewById(R.id.top_view);
        skin_p = (ImageView)findViewById(R.id.skin); // 피부색
        hair_view = (ImageView) findViewById(R.id.hair_view); // 머리
        eye_view = (ImageView) findViewById(R.id.eye_view); // 눈
        mouth_view = (ImageView) findViewById(R.id.mouth_view); // 입

        // 레이아웃
        linearLayout1 = (LinearLayout)findViewById(R.id.linearLayout1);
        linearLayout2 = (LinearLayout)findViewById(R.id.linearLayout2);
        linearLayout3 = (LinearLayout)findViewById(R.id.linearLayout3);
        linearLayout4 = (LinearLayout)findViewById(R.id.linearLayout4);
        linearLayout5 = (LinearLayout)findViewById(R.id.linearLayout5);

        // 상단 버튼
        skin_button = (Button)findViewById(R.id.skin_button);
        hair_button = (Button) findViewById(R.id.hair_button);
        eye_button = (Button) findViewById(R.id.eye_button);
        mouth_button = (Button)findViewById(R.id.mouth_button);
        top_button = (Button)findViewById(R.id.top_button);
        bottom_button = (Button) findViewById(R.id.bottom_button);

        // 머리 버튼
        hair_btn_1 = (ImageButton)findViewById(R.id.hair_btn_1);
        hair_btn_2 = (ImageButton)findViewById(R.id.hair_btn_2);
        hair_btn_3 = (ImageButton) findViewById(R.id.hair_btn_3);
        hair_btn_4 = (ImageButton) findViewById(R.id.hair_btn_4);
        hair_btn_5 = (ImageButton) findViewById(R.id.hair_btn_5);


        // 피부색 버튼 :: 이벤트 리스너
        skin_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skin_p.setImageResource(R.drawable.skin);
            }
        });

        skin_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skin_p.setImageResource(R.drawable.skin2);
            }
        });

        skin_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skin_p.setImageResource(R.drawable.skin3);
            }
        });

        skin_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skin_p.setImageResource(R.drawable.skin4);
            }
        });

        skin_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skin_p.setImageResource(R.drawable.skin5);
            }
        });

        
        
        // 눈 버튼 :: 이벤트 리스너
        eye_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eye_view.setImageResource(R.drawable.eye1);
            }
        });

        eye_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eye_view.setImageResource(R.drawable.eye2);
            }
        });

        eye_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eye_view.setImageResource(R.drawable.eye3);
            }
        });

        eye_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eye_view.setImageResource(R.drawable.eye4);
            }
        });


        // 머리색 버튼 :: 이벤트 리스너
        hair_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hair_view.setImageResource(R.drawable.hair1);
            }
        });

        hair_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hair_view.setImageResource(R.drawable.hair2);
            }
        });

        hair_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hair_view.setImageResource(R.drawable.hair3);
            }
        });

        hair_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hair_view.setImageResource(R.drawable.hair4);
            }
        });

        hair_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hair_view.setImageResource(R.drawable.hair5);
            }
        });

        
        // 입 버튼 :: 이벤트 리스너
        mouth_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mouth_view.setImageResource(R.drawable.mouth1);
            }
        });

        mouth_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mouth_view.setImageResource(R.drawable.mouth2);
            }
        });

        mouth_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mouth_view.setImageResource(R.drawable.mouth3);
            }
        });

        mouth_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mouth_view.setImageResource(R.drawable.mouth4);
            }
        });

        
        // 상단 버튼 :: 이벤트 리스너
        skin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout2.setVisibility(View.GONE);
                linearLayout3.setVisibility(View.GONE);
                linearLayout4.setVisibility(View.GONE);
                linearLayout5.setVisibility(View.GONE);

                linearLayout1.setVisibility(View.VISIBLE);
            }
        });

        hair_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setVisibility(View.GONE);
                linearLayout3.setVisibility(View.GONE);
                linearLayout4.setVisibility(View.GONE);
                linearLayout5.setVisibility(View.GONE);

                linearLayout2.setVisibility(View.VISIBLE);
            }
        });

        eye_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setVisibility(View.GONE);
                linearLayout2.setVisibility(View.GONE);
                linearLayout4.setVisibility(View.GONE);
                linearLayout5.setVisibility(View.GONE);

                linearLayout3.setVisibility(View.VISIBLE);
            }
        });

        mouth_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setVisibility(View.GONE);
                linearLayout2.setVisibility(View.GONE);
                linearLayout3.setVisibility(View.GONE);
                linearLayout5.setVisibility(View.GONE);

                linearLayout4.setVisibility(View.VISIBLE);
            }
        });

        top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setVisibility(View.GONE);
                linearLayout2.setVisibility(View.GONE);
                linearLayout3.setVisibility(View.GONE);
                linearLayout4.setVisibility(View.GONE);

                linearLayout5.setVisibility(View.VISIBLE);
            }
        });
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