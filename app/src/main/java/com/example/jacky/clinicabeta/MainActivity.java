package com.example.jacky.clinicabeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        t1 = (TextView)findViewById(R.id.txt01);
        t1.setOnClickListener(this);
        t2 = (TextView) findViewById(R.id.txt02);
        t2.setOnClickListener(this);




    }
    @Override

    public void onClick(View arg0){
        Intent intent = null;
        switch (arg0.getId()){
            case R.id.txt02:
                 intent = new Intent(MainActivity.this, RegistrarActivity.class);


                break;
            case R.id.txt01:
                 intent = new Intent(MainActivity.this, Olvidar_Contas_Activity.class);
                break;
        }
        startActivity(intent);

    }

}



