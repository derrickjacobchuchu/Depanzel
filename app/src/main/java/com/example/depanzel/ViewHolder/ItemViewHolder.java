package com.example.depanzel.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.depanzel.Interface.ItemClickListener;
import com.example.depanzel.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtProductName, txtProductDescription, txtProductPrice, txtProductStatus;
    public ImageView imageView;
    public ItemClickListener listener;


    public ItemViewHolder(@NonNull View itemView)
    {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.product_seller_image);
        txtProductName= (TextView) itemView.findViewById(R.id.product_seller_name);
        txtProductDescription= (TextView) itemView.findViewById(R.id.product_seller_description);
        txtProductPrice = (TextView) itemView.findViewById(R.id.product_seller_price);
        txtProductStatus = (TextView) itemView.findViewById(R.id.product_seller_state);
    }

    public void setItemClickListener(ItemClickListener listener)
    {
        this.listener = listener;
    }
    public void onClick(View view)
    {
        listener.onClick(view, getAdapterPosition(), false);
    }
}
