package com.example.fragmentmcd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

import com.example.fragmentmcd.fragment.AyamFragment;
import com.example.fragmentmcd.fragment.DagingFragment;
import com.example.fragmentmcd.fragment.FirstFragment;

public class FragmentDinamis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_dinamis);

        loadFragment(new FirstFragment());

        ImageView img1, img2, img3, img4;
        img1 = findViewById(R.id.imageView9);
        img2 = findViewById(R.id.imageView10);
        img3 = findViewById(R.id.imageView11);
        img4 = findViewById(R.id.imageView12);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new MainActivity();
                getSupportFragmentManager().popBackStackImmediate();
                img2.clearColorFilter();
                img3.clearColorFilter();
                img4.clearColorFilter();
                loadFragment(frag);
                img1.setColorFilter(getResources().getColor(R.color.yellow));
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new FirstFragment();
                getSupportFragmentManager().popBackStackImmediate();
                img1.clearColorFilter();
                img3.clearColorFilter();
                img4.clearColorFilter();
                loadFragment(frag);
                img2.setColorFilter(getResources().getColor(R.color.yellow));
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new AyamFragment();
                getSupportFragmentManager().popBackStackImmediate();
                img1.clearColorFilter();
                img2.clearColorFilter();
                img4.clearColorFilter();
                loadFragment(frag);
                img3.setColorFilter(getResources().getColor(R.color.yellow));
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new DagingFragment();
                getSupportFragmentManager().popBackStackImmediate();
                img1.clearColorFilter();
                img2.clearColorFilter();
                img3.clearColorFilter();
                loadFragment(frag);
                img4.setColorFilter(getResources().getColor(R.color.yellow));
            }
        });

        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(FragmentDinamis.this, imageView);
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

        ImageView imageView2 = findViewById(R.id.imageView3);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(FragmentDinamis.this, v);
                popupMenu.getMenuInflater().inflate(R.menu.menu_tiga_titik, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_titik_1:
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

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_fragment, fragment)
                .commit();
    }
}
