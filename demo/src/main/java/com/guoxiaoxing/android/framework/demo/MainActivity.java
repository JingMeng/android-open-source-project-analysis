package com.guoxiaoxing.android.framework.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.guoxiaoxing.android.framework.demo.app_framwork.ApplicationActivity;
import com.guoxiaoxing.android.framework.demo.native_framwork.SystemActivity;
import com.guoxiaoxing.android.framework.demo.program_idea.ProgramActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            // 妯℃嫙鏁版嵁鍔犺浇
            Thread.sleep(2000);
            // 涓婃姤鍚姩鏃堕棿锛岃繖涓柟娉曞湪API 19 浠ヤ笅涓嶆敮鎸侊紝浼歝rash锛屾墍浠ヨ皟鐢?            // 鐨勬椂鍊欏仛涓€涓媡ry catch
            reportFullyDrawn();
        }catch(Exception e){
            e.printStackTrace();
        }

        findViewById(R.id.btn_application).setOnClickListener(this);
        findViewById(R.id.btn_system).setOnClickListener(this);
        findViewById(R.id.btn_program).setOnClickListener(this);

        Debug.startMethodTracing();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Debug.stopMethodTracing();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_application: {
                Intent intent = new Intent(MainActivity.this, ApplicationActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_system: {
                Intent intent = new Intent(MainActivity.this, SystemActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_program: {
                Intent intent = new Intent(MainActivity.this, ProgramActivity.class);
                startActivity(intent);
            }
            break;
        }
    }
}

