package com.mypushtak.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyOrders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);
    }

    public void movetoorderdetails(View view)
    {
        Intent i1=new Intent(this,OrderDetails.class);
        startActivity(i1);
    }
}
