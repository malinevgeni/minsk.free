package com.example.user.mf_iteration_1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MeetsClass extends Fragment {

    String data[] = new String[]{"ByGis", "Хакатон у Жоры"};

    public static MeetsClass newInstance() {
        MeetsClass fragment = new MeetsClass();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.meets, container, false);

    }

}