package bumbums.puzzlepiece.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bumbums.puzzlepiece.R;
import bumbums.puzzlepiece.ui.adapter.FriendRecyclerViewAdapter;
import io.realm.Realm;

/**
 * Created by han sb on 2017-02-15.
 */

public class TabSettingFragment extends Fragment  {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_setting, container,false);
        return view;
    }
}