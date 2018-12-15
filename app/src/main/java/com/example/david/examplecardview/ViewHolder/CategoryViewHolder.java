package com.example.david.examplecardview.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.david.examplecardview.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    public TextView name,image;
    public CategoryViewHolder(View itemView) {
        super(itemView);
        name = (TextView)itemView.findViewById(R.id.txNama);
        image = (TextView) itemView.findViewById(R.id.txDesc);
    }
}
