package vn.neolab.anotation.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;

import vn.neolab.anotation.R;

/**
 * Created by NLDN_HoNhatTan on 6/3/2016.
 */
@EActivity(R.layout.activity_extras)
public class ExtrasActivity extends AppCompatActivity {
    @Extra
    String mMessage;
    @ViewById(R.id.tvData)
    TextView mTvData;
    @AfterViews
    void afterViews(){
        mTvData.setText(mMessage);
    }

    @Override
    public void onBackPressed() {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result","ExtrasActivity");
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}
