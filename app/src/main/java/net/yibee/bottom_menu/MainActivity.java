package net.yibee.bottom_menu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import net.yibee.bottom_menu.fragment.ArticleFragment;
import net.yibee.bottom_menu.fragment.MoreFragment;
import net.yibee.bottom_menu.fragment.MovieFragment;


public class MainActivity  extends FragmentActivity {

    @ViewInject(R.id.id_tab_article_iv)
    private ImageView id_tab_article_iv;
    @ViewInject(R.id.id_tab_movie_iv)
    private ImageView id_tab_movie_iv;
    @ViewInject(R.id.id_tab_more_iv)
    private ImageView id_tab_more_iv;
    @ViewInject(R.id.id_tab_article_tv)
    private TextView id_tab_article_tv;
    @ViewInject(R.id.id_tab_movie_tv)
    private TextView id_tab_movie_tv;
    @ViewInject(R.id.id_tab_more_tv)
    private TextView id_tab_more_tv;
    @ViewInject(R.id.id_tab_article)
    private LinearLayout id_tab_article;
    @ViewInject(R.id.id_tab_movie)
    private LinearLayout id_tab_movie;
    @ViewInject(R.id.id_tab_more)
    private LinearLayout id_tab_more;
    private Fragment articleFragment;
    private Fragment moreFragment;
    private Fragment movieFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getActionBar().hide();
        ViewUtils.inject(this);
        selectedImages(0);
    }
    /**
     * 初始化图片
     */
    private void resetImages() {
        id_tab_article_iv.setImageResource(R.drawable.tab_weixin_normal);
        id_tab_movie_iv.setImageResource(R.drawable.tab_find_frd_normal);
        id_tab_more_iv.setImageResource(R.drawable.tab_address_normal);
        id_tab_article_tv.setTextColor(getResources().getColor(R.color.text_bottom_normal));
        id_tab_movie_tv.setTextColor(getResources().getColor(R.color.text_bottom_normal));
        id_tab_more_tv.setTextColor(getResources().getColor(R.color.text_bottom_normal));
    }

    /**
     * 设置选中
     *
     * @param i
     */
    private void selectedImages(int i) {
        resetImages();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hideFragment(fragmentTransaction);
        switch (i) {
            case 0:
                if (articleFragment == null) {
                    articleFragment = new ArticleFragment();
                    fragmentTransaction.add(R.id.id_content, articleFragment);
                } else {
                    fragmentTransaction.show(articleFragment);
                }
                id_tab_article_iv.setImageResource(R.drawable.tab_weixin_pressed);
                id_tab_article_tv.setTextColor(getResources().getColor(R.color.text_bottom_focus));

                break;
            case 1:
                if (movieFragment == null) {
                    movieFragment = new MovieFragment();
                    fragmentTransaction.add(R.id.id_content, movieFragment);

                } else {
                    fragmentTransaction.show(movieFragment);
                }
                id_tab_movie_iv.setImageResource(R.drawable.tab_find_frd_pressed);
                id_tab_movie_tv.setTextColor(getResources().getColor(R.color.text_bottom_focus));
                break;
            case 2:
                if (moreFragment == null) {
                    moreFragment = new MoreFragment();
                    fragmentTransaction.add(R.id.id_content, moreFragment);
                } else {
                    fragmentTransaction.show(moreFragment);
                }
                id_tab_more_iv.setImageResource(R.drawable.tab_address_pressed);
                id_tab_more_tv.setTextColor(getResources().getColor(R.color.text_bottom_focus));
                break;
            default:
                break;

        }
        fragmentTransaction.commit();
    }

    /**
     * 初始化隐藏所有Fragment
     *
     * @param fragmentTransaction
     */
    private void hideFragment(FragmentTransaction fragmentTransaction) {
        if (articleFragment != null) {
            fragmentTransaction.hide(articleFragment);
        }
        if (movieFragment != null) {
            fragmentTransaction.hide(movieFragment);
        }
        if (moreFragment != null) {
            fragmentTransaction.hide(moreFragment);
        }

    }

    @OnClick(R.id.id_tab_article)
    private void click_id_tab_article(View view) {
        selectedImages(0);
    }

    @OnClick(R.id.id_tab_movie)
    private void click_id_tab_movie(View view) {
        selectedImages(1);
    }

    @OnClick(R.id.id_tab_more)
    private void click_id_tab_more(View view) {
        selectedImages(2);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onResume() {
        super.onResume();
    }
    public void onPause() {
        super.onPause();
    }
}
