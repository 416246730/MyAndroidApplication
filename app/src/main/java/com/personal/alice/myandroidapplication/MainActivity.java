package com.personal.alice.myandroidapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button indexCinButton;
    private Button indexStockButton;
    private Button indexNewsButton;
    private Button indexReaderButton;
    private Button indexGraduationButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indexCinButton = (Button)findViewById(R.id.index_cin_button);
        indexCinButton.setOnClickListener(new onButtonClickListener());


        indexStockButton = (Button)findViewById(R.id.index_stock_button);
        indexStockButton.setOnClickListener(new onButtonClickListener());


        indexNewsButton = (Button)findViewById(R.id.index_news_button);
        indexNewsButton.setOnClickListener(new onButtonClickListener());


        indexReaderButton = (Button)findViewById(R.id.index_reader_button);
        indexReaderButton.setOnClickListener(new onButtonClickListener());


        indexGraduationButton = (Button)findViewById(R.id.index_graduation_button);
        indexGraduationButton.setOnClickListener(new onButtonClickListener());
    }


    class onButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Button btn = (Button)v;
            CharSequence text = "启动应用："+btn.getText() ;
            Toast toast = Toast.makeText(MainActivity.this,text, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
