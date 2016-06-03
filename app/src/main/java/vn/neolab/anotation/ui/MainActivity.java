package vn.neolab.anotation.ui;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.App;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OnActivityResult;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;

import vn.neolab.anotation.ExtrasActivity_;
import vn.neolab.anotation.MyApplication;
import vn.neolab.anotation.R;
import vn.neolab.anotation.adapters.TabAdapter;
import vn.neolab.anotation.sharedpreferences.Preference_;
import vn.neolab.anotation.views.TabView;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements TabView.TabChangeListening {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int REQUEST_EXTRAS = 1;
    @ViewById(R.id.viewpagerHome)
    ViewPager mViewPagerHome;
    @Pref
    Preference_ mPreference;
    @ViewById(R.id.tabViewHome)
    TabView mTabView;
    @App
    MyApplication mMyApp;
    @AfterViews
    void afterViews() {
        Log.d(TAG, "afterViews");
        mPreference.created().put(true);
        mPreference.countCreated().put(mPreference.countCreated().get() + 1);
        Log.d(TAG, "countCreated=" + mPreference.countCreated().get());
        /////
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        mViewPagerHome.setAdapter(adapter);
        mTabView.setTabChangeListening(this);
        mMyApp.test();
    }

    @Click(R.id.btnStartExtras)
    void clickButtonExtras() {
        ExtrasActivity_.intent(this).mMessage("Alo").startForResult(REQUEST_EXTRAS);
    }

    @OnActivityResult(REQUEST_EXTRAS)
    void onResultFromExtrasActivity(int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            String message = data.getStringExtra("result");
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void clickTab1() {
        mViewPagerHome.setCurrentItem(0);
    }

    @Override
    public void clickTab2() {
        mViewPagerHome.setCurrentItem(1);
    }

    @Override
    public void clickTab3() {
        mViewPagerHome.setCurrentItem(2);
    }

    @Override
    public void clickTab4() {
        mViewPagerHome.setCurrentItem(3);
    }
}
