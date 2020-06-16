package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private Button button2;
    Random r=new Random();
    int rand;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        button2=findViewById(R.id.button2);




        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rand= r.nextInt((120-1)+1)+1;   //SECOND METHOD
                //rand=new  Random().nextInt((120-1)+1)+1; ANOTHER METHOD
                //Toast.makeText(getApplicationContext(),"hi "+rand,Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=Integer.parseInt(editText.getText().toString());
                if (num<rand)
                {
                    Toast.makeText(getApplicationContext(),"Higher",Toast.LENGTH_SHORT).show();

                }
                else if (num>rand){
                    Toast.makeText(getApplicationContext(),"Lower",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"You Got it Right",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
