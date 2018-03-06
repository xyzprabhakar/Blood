package com.glazegalway.bloodstain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    String st_name = "Sumit & Prabhakar";
    TextView tv_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv_textview = (TextView) findviewbyid(R.id.tv_textview);
        tv_textview.setText(st_name);
          
        
        
    }
}
