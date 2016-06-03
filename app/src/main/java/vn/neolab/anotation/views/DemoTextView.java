package vn.neolab.anotation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import org.androidannotations.annotations.EView;

/**
 * Created by NLDN_HoNhatTan on 6/3/2016.
 */
@EView
public class DemoTextView extends TextView {
    public DemoTextView(Context context) {
        super(context);
    }

    public DemoTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DemoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
