package com.example.practicabotones;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    GridLayout g;
    Button b;
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g=findViewById(R.id.gridlayout);


        crear();


    }
    public  void crear(){

        for ( int i=0;i<16;i++)
        {

            int r = rand.nextInt();


            b=new Button(this);
            b.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
            b.setText("Boton: "+i);
            b.setId(View.generateViewId());

            b.setBackgroundColor(r);

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((Button)v).setBackgroundColor(0);
                }
            });
            if(i==15){
                b=new Button(this);
                b.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
                b.setText("RESET");
                b.setId(View.generateViewId());
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        g.removeAllViewsInLayout();
                        crear();

                    }
                });


            }

            g.addView(b);
    }


}
}
