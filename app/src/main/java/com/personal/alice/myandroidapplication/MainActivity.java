package com.personal.alice.myandroidapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void indexButtonOnClick(View v){
        Button btn = (Button)v;
        CharSequence text = "启动应用："+btn.getText() ;
        Toast toast = Toast.makeText(MainActivity.this,text, Toast.LENGTH_SHORT);
        toast.show();
    }
}
