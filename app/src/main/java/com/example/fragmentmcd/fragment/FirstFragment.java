package com.example.fragmentmcd.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.fragmentmcd.R;
import com.example.fragmentmcd.SoyGarlic;

public class FirstFragment extends Fragment {

    public void goToSoyGarlic(View view) {
        Intent intent = new Intent(getActivity(), SoyGarlic.class);
        startActivity(intent);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup contaniner, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, contaniner, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView img1 = view.findViewById(R.id.imageView14);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSoyGarlic(v);
            }
        });
    }
}