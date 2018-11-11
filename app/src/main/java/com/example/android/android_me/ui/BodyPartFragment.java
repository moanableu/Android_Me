package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

public class BodyPartFragment extends Fragment {

    public BodyPartFragment(){
        //required to instantiate this fragment
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // reference to obj in layout
        ImageView imageView = rootView.findViewById(R.id.body_part_image_view);

        imageView.setImageResource(R.drawable.head8);


        return rootView;
    }
}
