package vn.neolab.anotation.ui;

import android.support.v4.app.Fragment;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

import vn.neolab.anotation.R;

/**
 * Created by NLDN_HoNhatTan on 6/3/2016.
 */
@EFragment(R.layout.fragment_tab)
public class TabFragment extends Fragment {
   @ViewById(R.id.tvPage)
    TextView mTvPage;
    @FragmentArg
    int mPage;
    @AfterViews
    void afterViews(){
        mTvPage.setText("Page "+mPage);
    }

}