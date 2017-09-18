package com.example.user.mf_iteration_1;

import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

public class FavoritesClass extends Fragment {
    public static FavoritesClass newInstance() {
        FavoritesClass fragment = new FavoritesClass();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.favorites, container, false);
    }
}
