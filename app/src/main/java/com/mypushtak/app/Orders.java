package com.mypushtak.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Orders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
    }

    public void movetomyorders(View view)
    {
        Intent i1=new Intent(this,MyOrders.class);
        startActivity(i1);
    }
}
