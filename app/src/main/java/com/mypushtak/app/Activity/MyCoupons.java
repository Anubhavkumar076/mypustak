package com.mypushtak.app.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.mypushtak.app.Adapters.DeliveryAddressAdapter;
import com.mypushtak.app.Adapters.MyCouponAdapter;
import com.mypushtak.app.R;

/*
 ****@author Anubhav Kumar
 * *****
 */

public class MyCoupons extends AppCompatActivity {

    private RecyclerView mRecylerView;
    private RecyclerView.Adapter mAdapter;
    String letterlist[]= {"A","B","C","D","E","F","G","H","I","J","K","L"
            ,"M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_coupons);
        mRecylerView=findViewById(R.id.my_coupons_recycler);

        mRecylerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLinearLayout=new LinearLayoutManager(this);
        mRecylerView.setLayoutManager(mLinearLayout);
        Log.d("unique","activity");
        mAdapter=new MyCouponAdapter(this,letterlist);
        mRecylerView.setAdapter(mAdapter);
        Log.d("unique","activity2");
    }
}
