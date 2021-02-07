//2. 선택화면
package com.example.smartcloset;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class StartActivity extends AppCompatActivity implements OnClickListener {

    /* 1) 변수 선언 */
    LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7; // 레이아웃
    ImageView skin_p, hair_view, eye_view, mouth_view, top_view, bottom_view, bg_view; //이미지 뷰
    Button skin_button, hair_button, eye_button, mouth_button, top_button, bottom_button, bg_button; //바꿀 부분 선택 버튼
    ImageButton skin_btn_1, skin_btn_2, skin_btn_3, skin_btn_4, skin_btn_5; // 피부색1~5 버튼
    ImageButton hair_btn_1, hair_btn_2, hair_btn_3, hair_btn_4, hair_btn_5; // 머리1~5 버튼
    ImageButton eye_btn_1, eye_btn_2, eye_btn_3, eye_btn_4; // 눈1~4 버튼
    ImageButton mouth_btn_1, mouth_btn_2, mouth_btn_3, mouth_btn_4; // 입1~4 버튼
    ImageButton shirts_bt, tshirt_bt, sweater_bt, vest_bt; //상의1~4 버튼
    ImageButton bottom_btn_1, bottom_btn_2, bottom_btn_3, bottom_btn_4, bottom_btn_5; //하의1~5 버튼
    ImageButton bg_btn_1, bg_btn_2, bg_btn_3, bg_btn_4, bg_btn_5, bg_btn_6, bg_btn_7, bg_btn_8; //배경색1~8 버튼
    ImageButton download_btn; //다운로드 버튼
    RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        /* 2) 버튼 값 아이디로 가져와서 넣기 */

        // 0-1. 레이아웃
        container = (RelativeLayout)findViewById(R.id.Container);
        linearLayout1 = (LinearLayout)findViewById(R.id.linearLayout1);
        linearLayout2 = (LinearLayout)findViewById(R.id.linearLayout2);
        linearLayout3 = (LinearLayout)findViewById(R.id.linearLayout3);
        linearLayout4 = (LinearLayout)findViewById(R.id.linearLayout4);
        linearLayout5 = (LinearLayout)findViewById(R.id.linearLayout5);
        linearLayout6 = (LinearLayout)findViewById(R.id.linearLayout6);
        linearLayout7 = (LinearLayout)findViewById(R.id.linearLayout7);

        // 0-2. 상단 버튼
        skin_button = (Button)findViewById(R.id.skin_button);
        hair_button = (Button) findViewById(R.id.hair_button);
        eye_button = (Button) findViewById(R.id.eye_button);
        mouth_button = (Button)findViewById(R.id.mouth_button);
        top_button = (Button)findViewById(R.id.top_button);
        bottom_button = (Button) findViewById(R.id.bottom_button);
        bg_button = (Button)findViewById(R.id.bg_button);
        download_btn = (ImageButton)findViewById(R.id.download_btn);

        // 1. 피부색 버튼
        skin_btn_1 = (ImageButton)findViewById(R.id.skin_btn_1);
        skin_btn_2 = (ImageButton)findViewById(R.id.skin_btn_2);
        skin_btn_3 = (ImageButton)findViewById(R.id.skin_btn_3);
        skin_btn_4 = (ImageButton)findViewById(R.id.skin_btn_4);
        skin_btn_5 = (ImageButton)findViewById(R.id.skin_btn_5);

        // 2. 머리 버튼
        hair_btn_1 = (ImageButton)findViewById(R.id.hair_btn_1);
        hair_btn_2 = (ImageButton)findViewById(R.id.hair_btn_2);
        hair_btn_3 = (ImageButton) findViewById(R.id.hair_btn_3);
        hair_btn_4 = (ImageButton) findViewById(R.id.hair_btn_4);
        hair_btn_5 = (ImageButton) findViewById(R.id.hair_btn_5);

        // 3. 눈 버튼
        eye_btn_1 = (ImageButton) findViewById(R.id.eye_btn_1);
        eye_btn_2 = (ImageButton) findViewById(R.id.eye_btn_2);
        eye_btn_3 = (ImageButton) findViewById(R.id.eye_btn_3);
        eye_btn_4  = (ImageButton) findViewById(R.id.eye_btn_4);

        // 4. 입 버튼
        mouth_btn_1 = (ImageButton) findViewById(R.id.mouth_btn_1);
        mouth_btn_2 = (ImageButton) findViewById(R.id.mouth_btn_2);
        mouth_btn_3 = (ImageButton) findViewById(R.id.mouth_btn_3);
        mouth_btn_4 = (ImageButton) findViewById(R.id.mouth_btn_4);

        // 5. 상의 버튼
        shirts_bt = (ImageButton)findViewById(R.id.shirts_button);
        tshirt_bt = (ImageButton)findViewById(R.id.tshirt_button);
        sweater_bt = (ImageButton)findViewById(R.id.sweater_button);
        vest_bt = (ImageButton)findViewById(R.id.vest_button);

        // 6. 하의 버튼
        bottom_btn_1 = (ImageButton) findViewById(R.id.short_pants);
        bottom_btn_2 = (ImageButton) findViewById(R.id.slacks);
        bottom_btn_3 = (ImageButton) findViewById(R.id.jean);
        bottom_btn_4 = (ImageButton) findViewById(R.id.check_skirt);
        bottom_btn_5 = (ImageButton) findViewById(R.id.tennis_skirt);

        // 7. 배경색 버튼
        bg_btn_1 = (ImageButton) findViewById(R.id.bg_btn_1);
        bg_btn_2 = (ImageButton) findViewById(R.id.bg_btn_2);
        bg_btn_3 = (ImageButton) findViewById(R.id.bg_btn_3);
        bg_btn_4 = (ImageButton) findViewById(R.id.bg_btn_4);
        bg_btn_5 = (ImageButton) findViewById(R.id.bg_btn_5);
        bg_btn_6 = (ImageButton) findViewById(R.id.bg_btn_6);
        bg_btn_7 = (ImageButton) findViewById(R.id.bg_btn_7);
        bg_btn_8 = (ImageButton) findViewById(R.id.bg_btn_8);

        //버튼에 클릭 이벤트 처리
        shirts_bt.setOnClickListener(this);
        tshirt_bt.setOnClickListener(this);
        sweater_bt.setOnClickListener(this);
        vest_bt.setOnClickListener(this);
        bottom_btn_1.setOnClickListener(this);
        bottom_btn_2.setOnClickListener(this);
        bottom_btn_3.setOnClickListener(this);
        bottom_btn_4.setOnClickListener(this);
        bottom_btn_5.setOnClickListener(this);
        bg_btn_1.setOnClickListener(this);
        bg_btn_2.setOnClickListener(this);
        bg_btn_3.setOnClickListener(this);
        bg_btn_4.setOnClickListener(this);
        bg_btn_5.setOnClickListener(this);
        bg_btn_6.setOnClickListener(this);
        bg_btn_7.setOnClickListener(this);
        bg_btn_8.setOnClickListener(this);

        //xml에 불러운 이미지뷰를 iv에 넣어 속성 사용하기 위한 구문
        skin_p = (ImageView)findViewById(R.id.skin); // 피부색
        hair_view = (ImageView) findViewById(R.id.hair_view); // 머리
        eye_view = (ImageView) findViewById(R.id.eye_view); // 눈
        mouth_view = (ImageView) findViewById(R.id.mouth_view); // 입
        top_view = (ImageView)findViewById(R.id.top_view); //상의
        bottom_view = (ImageView)findViewById(R.id.bottom_view); //하의
        bg_view = (ImageView)findViewById(R.id.bg_view); //배경색


        //3. 저장버튼 눌렀을 때 이미지뷰를 저장

        //다운로드 버튼 :: 이벤트 리스너
        download_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. 캡처 준비
                container.buildDrawingCache();
                Bitmap captureView = container.getDrawingCache();
                FileOutputStream fos;
                long systemTime = System.currentTimeMillis();
                SimpleDateFormat formatting = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.KOREA);
                String strTime = formatting.format(systemTime); //현재 시간 - 파일 이름에 넣어주기 위해서

                //2. 새 폴더 - my closet 만들기
                /*
                final String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString();
                final File myDir = new File(path + "/MyCloset");
                if (!myDir.exists())
                {
                    myDir.mkdirs();
                }
                */
                File tempFile = new File(getCacheDir(), strTime);

                try {
                    tempFile.createNewFile();
                    FileOutputStream out = new FileOutputStream(tempFile);
                    captureView.compress(Bitmap.CompressFormat.JPEG, 100, out);
                    out.close();
                    Toast.makeText(getApplicationContext(), "파일 저장 성공", Toast.LENGTH_SHORT).show();

                    /*
                    fos = new FileOutputStream(new File(myDir.getPath()+"/"+strTime+".jpeg"));
                    captureView.compress(Bitmap.CompressFormat.JPEG, 100, fos);

                    //2. 캡처본 갤러리 스캔
                    sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,
                            Uri.parse("file://"+myDir.getPath()+"/"+strTime+".jpeg")));
*/
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                //3. 저장되었다고 팝업 출력
                new AlertDialog.Builder(StartActivity.this)
                        .setTitle("다운로드")
                        .setMessage("[나만의 클로젯]\n다운이 완료되었습니다.\n\n저장경로: "+tempFile.getPath().toString()) //myDir.getPath()+"/"+strTime+".jpeg")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show();
                Toast.makeText(getApplicationContext(), "Captured!", Toast.LENGTH_LONG).show();

            }
        });

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
                linearLayout6.setVisibility(View.GONE);
                linearLayout7.setVisibility(View.GONE);

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
                linearLayout6.setVisibility(View.GONE);
                linearLayout7.setVisibility(View.GONE);

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
                linearLayout6.setVisibility(View.GONE);
                linearLayout7.setVisibility(View.GONE);

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
                linearLayout6.setVisibility(View.GONE);
                linearLayout7.setVisibility(View.GONE);

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
                linearLayout6.setVisibility(View.GONE);
                linearLayout7.setVisibility(View.GONE);

                linearLayout5.setVisibility(View.VISIBLE);
            }
        });

        bottom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setVisibility(View.GONE);
                linearLayout2.setVisibility(View.GONE);
                linearLayout3.setVisibility(View.GONE);
                linearLayout4.setVisibility(View.GONE);
                linearLayout5.setVisibility(View.GONE);
                linearLayout7.setVisibility(View.GONE);

                linearLayout6.setVisibility(View.VISIBLE);
            }
        });

        bg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setVisibility(View.GONE);
                linearLayout2.setVisibility(View.GONE);
                linearLayout3.setVisibility(View.GONE);
                linearLayout4.setVisibility(View.GONE);
                linearLayout6.setVisibility(View.GONE);
                linearLayout5.setVisibility(View.GONE);

                linearLayout7.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shirts_button:
                //이미지뷰에 사진을 출력하는 구문
                top_view.setImageResource(R.drawable.shirts);
                break;
            case R.id.tshirt_button:
                top_view.setImageResource(R.drawable.tshirt);
                break;
            case R.id.sweater_button:
                top_view.setImageResource(R.drawable.sweater);
                break;
            case R.id.vest_button:
                top_view.setImageResource(R.drawable.vest);
                break;

            case R.id.check_skirt:
                bottom_view.setImageResource(R.drawable.check_skirt);
                break;
            case R.id.short_pants:
                bottom_view.setImageResource(R.drawable.shortpants);
                break;
            case R.id.jean:
                bottom_view.setImageResource(R.drawable.jean);
                break;
            case R.id.slacks:
                bottom_view.setImageResource(R.drawable.slacks);
                break;
            case R.id.tennis_skirt:
                bottom_view.setImageResource(R.drawable.tennis_skirt);
                break;

            case R.id.bg_btn_1:
                bg_view.setImageResource(R.drawable.bg_1);
                break;
            case R.id.bg_btn_2:
                bg_view.setImageResource(R.drawable.bg_2);
                break;
            case R.id.bg_btn_3:
                bg_view.setImageResource(R.drawable.bg_3);
                break;
            case R.id.bg_btn_4:
                bg_view.setImageResource(R.drawable.bg_4);
                break;
            case R.id.bg_btn_5:
                bg_view.setImageResource(R.drawable.bg_5);
                break;

            case R.id.bg_btn_6:
                bg_view.setImageResource(R.drawable.bg_6);
                break;
            case R.id.bg_btn_7:
                bg_view.setImageResource(R.drawable.bg_7);
                break;
            case R.id.bg_btn_8:
                bg_view.setImageResource(R.drawable.bg_8);
                break;
        }
    }

}