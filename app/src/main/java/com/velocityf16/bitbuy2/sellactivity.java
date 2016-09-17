package com.velocityf16.bitbuy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sellactivity extends AppCompatActivity {

    public Button ledger;
    public Button store;
    public Button newItem;

    public void init3() {
        ledger = (Button) findViewById(R.id.ledger);

        ledger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent change3 = new Intent(sellactivity.this, ledger.class);

                startActivity(change3);


            }
        });
    }

    public void init4() {
        store = (Button) findViewById(R.id.store);

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent change4 = new Intent(sellactivity.this, store.class);

                startActivity(change4);


            }
        });
    }

    public void init5() {
        newItem = (Button) findViewById(R.id.newItem);

        newItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent change5 = new Intent(sellactivity.this, newitem.class);

                startActivity(change5);


            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellactivity);
        init3();
        init4();
        init5();
    }
}
