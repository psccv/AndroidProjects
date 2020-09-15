package com.example.doitandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //화면에서 클릭 이벤트를 처리하는 두가지 방법중 두번째
        Button btn_app_login = (Button) findViewById(R.id.app_login);
        //특징: 온클릭 이벤트를 자바에서 시작한다.(아래)
        //리스너: 이벤트 대기상태
        btn_app_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"방법2 로그인 성공", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void testOnclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("메시지창");
        builder.setMessage("우와 메시지창 띄웠다~");
        builder.setPositiveButton("예",null);
        builder.setNegativeButton("아니오",  null);
        builder.setNeutralButton("취소", null);
        builder.create().show();

    }
    //아래 코드는 화면에서 클릭 이벤트를 처리하는 두가지 방법중 첫번째
    public void AppLogin(View view) {
        Toast.makeText(this,"로그인 성공", Toast.LENGTH_LONG).show();
    }

    public void HpTel(View view) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0000"));
        startActivity(myIntent);
    }

    public void NaverGoUrl(View view) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
        startActivity(myIntent);
    }

    public void NewActivity(View view) {
        Intent newActivity = new Intent(this, SubActivity.class);
        startActivity(newActivity);
    }
}