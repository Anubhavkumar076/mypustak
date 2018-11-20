package com.mypushtak.app.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mypushtak.app.R;


/*
 ****@author Anubhav Kumar
 * *****
 */

public class MyCouponAdapter extends RecyclerView.Adapter<MyCouponAdapter.ViewHolder> {

    private Context context;

    private String letters[];

    public MyCouponAdapter(Context context, String[] letters) {
        this.context = context;
        this.letters = letters;
    }

    @NonNull
    @Override
    public MyCouponAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.coupons_container,parent,false);

        return new MyCouponAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCouponAdapter.ViewHolder holder, int position) {

        holder.offer_code.setText(letters[position]);
    }

    @Override
    public int getItemCount() {
        return letters.length;
    }




    protected class ViewHolder extends RecyclerView.ViewHolder{
        private TextView offer_percent,offer_code,offer_expiry;

        public ViewHolder(View itemView) {
            super(itemView);
            offer_percent=itemView.findViewById(R.id.offer_percent);
            offer_code=itemView.findViewById(R.id.offer_code);
            offer_expiry=itemView.findViewById(R.id.offer_expiry_date);

        }
    }
}
