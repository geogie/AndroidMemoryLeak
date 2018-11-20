package com.example.george.myapplication;

import android.support.v4.app.Fragment;

import com.squareup.leakcanary.RefWatcher;

/**
 * 使用 RefWatcher 监控 Fragment
 */
public abstract class BaseFragment extends Fragment {

    @Override public void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = App.getRefWatcher(getActivity());
        refWatcher.watch(this);
    }
}
