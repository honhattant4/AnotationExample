package vn.neolab.anotation.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.androidannotations.annotations.EBean;

import vn.neolab.anotation.TabFragment_;


/**
 * Created by NLDN_HoNhatTan on 6/3/2016.
 */

public class TabAdapter extends FragmentPagerAdapter {

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment_.builder().mPage(position).build();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
