package com.mypushtak.app.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.mypushtak.app.R;

/*
 ****@author Anubhav Kumar
 * *****
 */

public class EmptyOrder extends AppCompatActivity {

    private Button orderbook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_order);

        orderbook=findViewById(R.id.empty_order_book);
    }
}
