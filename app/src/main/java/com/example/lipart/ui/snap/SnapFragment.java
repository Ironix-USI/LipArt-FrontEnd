package com.example.lipart.ui.snap;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lipart.R;

public class SnapFragment extends Fragment {

    private SnapViewModel snapViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        snapViewModel =
                ViewModelProviders.of(this).get(SnapViewModel.class);
        View root = inflater.inflate(R.layout.fragment_snap, container, false);
        final TextView textView = root.findViewById(R.id.text_snap);
        snapViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
