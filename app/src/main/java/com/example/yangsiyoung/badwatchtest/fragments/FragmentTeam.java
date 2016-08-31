package com.example.yangsiyoung.badwatchtest.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yangsiyoung.badwatchtest.R;

import butterknife.ButterKnife;

/**
 * Created by Yang Si Young on 2016-08-14.
 */
public class FragmentTeam extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_record, parent, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
