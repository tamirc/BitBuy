package com.velocityf16.bitbuy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button buyButton;
    public Button sellButton;

    public void init() {
        buyButton = (Button) findViewById(R.id.buyButton);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent change = new Intent(MainActivity.this, buyactivity.class);

                startActivity(change);


            }
        });
    }

    public void init2() {
        sellButton = (Button) findViewById(R.id.sellButton);

        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent change2 = new Intent(MainActivity.this, sellactivity.class);

                startActivity(change2);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        init2();

    }
}
