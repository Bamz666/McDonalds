package com.example.fragmentmcd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class FirstPage extends AppCompatActivity {

    public ImageView imgPindah, imgRewards, imgKupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        imgPindah = findViewById(R.id.header);
        imgRewards = findViewById(R.id.imageView6);
        imgKupon = findViewById(R.id.kupon);

        imgRewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), FragmentDinamis.class);
                startActivity(itn);
            }
        });

        imgPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), SahurActivity.class);
                startActivity(itn);
            }
        });

        imgKupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), KuponActivity.class);
                startActivity(itn);
            }
        });

        ImageView imageView = findViewById(R.id.burger_menu);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(FirstPage.this, imageView);
                popupMenu.getMenuInflater().inflate(R.menu.my_app_menu, popupMenu.getMenu());

                popupMenu.getMenu().findItem(R.id.menu_item_1).setIcon(R.drawable.person);
                popupMenu.getMenu().findItem(R.id.menu_item_2).setIcon(R.drawable.message);
                popupMenu.getMenu().findItem(R.id.menu_item_3).setIcon(R.drawable.faq);
                popupMenu.getMenu().findItem(R.id.menu_item_3).setIcon(R.drawable.mekdi);

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_item_1:
                                return true;
                            case R.id.menu_item_2:
                                return true;
                            case R.id.menu_item_3:
                                return true;
                            case R.id.menu_item_4:
                                return true;
                            case R.id.menu_item_5:
                                return true;
                            case R.id.menu_item_6:
                                return true;
                            case R.id.menu_item_7:
                                return true;
                            case R.id.menu_item_8:
                                return true;
                            default:
                                return false;
                        }
                    }
                });

                popupMenu.show();
            }
        });
    }
}