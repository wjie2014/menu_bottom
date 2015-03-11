package net.yibee.bottom_menu.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.yibee.bottom_menu.R;


/**
 * Created by 王杰 on 2015/1/27.
 */
public class ArticleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_article, container, false);

        return view;
    }
   

}
