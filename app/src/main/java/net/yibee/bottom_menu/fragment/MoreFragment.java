package net.yibee.bottom_menu.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import net.yibee.bottom_menu.MainActivity;
import net.yibee.bottom_menu.R;

/**
 * Created by 王杰 on 2015/1/27.
 */
public class MoreFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_more, container, false);
        return view;
    }

    public void onResume() {
        super.onResume();
    }
    public void onPause() {
        super.onPause();
    }

}
