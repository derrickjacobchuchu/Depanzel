package com.example.depanzel.Sellers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.depanzel.R;

public class SellerProductsCategoryActivity extends AppCompatActivity
{
    private ImageView home_appliances, laptops, televisions, phones;
    private ImageView tablets, watches, headphones, gaming;
    private ImageView desktop_computers, sound_systems, networking_devices, printers_and_scanners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_product_category);



        home_appliances = (ImageView) findViewById(R.id.home_appliances);
        laptops = (ImageView) findViewById(R.id.laptops);
        televisions = (ImageView) findViewById(R.id.televisions);
        phones = (ImageView) findViewById(R.id.phones);


        tablets = (ImageView) findViewById(R.id.tablets);
        watches = (ImageView) findViewById(R.id.smart_watches);
        headphones = (ImageView) findViewById(R.id.head_phones);
        gaming = (ImageView) findViewById(R.id.gaming);


        desktop_computers = (ImageView) findViewById(R.id.desktop_computers);
        sound_systems = (ImageView) findViewById(R.id.sound_systems);
        networking_devices = (ImageView) findViewById(R.id.networking_devices);
        printers_and_scanners= (ImageView) findViewById(R.id.printers_and_scanners);



        home_appliances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "home_appliances");
                startActivity(intent);
            }
        });
        laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "laptops");
                startActivity(intent);
            }
        });
        televisions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "televisions");
                startActivity(intent);
            }
        });
        phones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "phones");
                startActivity(intent);
            }
        });
        tablets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "tablets");
                startActivity(intent);
            }
        });
        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "watches");
                startActivity(intent);
            }
        });
        headphones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "headphones");
                startActivity(intent);
            }
        });
        gaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "gaming");
                startActivity(intent);
            }
        });
        desktop_computers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "desktop_computers");
                startActivity(intent);
            }
        });
        sound_systems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "sound_systems");
                startActivity(intent);
            }
        });
        networking_devices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "networking_devices");
                startActivity(intent);
            }
        });
        printers_and_scanners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductsCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "printers_and_scanners");
                startActivity(intent);
            }
        });
    }
}
