package com.emredogan.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView card1;
    CardView card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.cardview_id);
        card2 = (CardView) findViewById(R.id.cardview_id2);
        
        
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                
            }
        });
        
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                
            }
        });
     }
}
