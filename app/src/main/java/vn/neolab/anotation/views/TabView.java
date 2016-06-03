package vn.neolab.anotation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EViewGroup;

import vn.neolab.anotation.R;

/**
 * Created by NLDN_HoNhatTan on 6/3/2016.
 */
@EViewGroup(R.layout.custom_tabview)
public class TabView extends LinearLayout {
    TabChangeListening mTabChangeListening;
    public TabView(Context context) {
        super(context);
    }

    public TabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TabView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Click(R.id.btnTab1)
    void clickTab1(){
        if (mTabChangeListening!=null){
            mTabChangeListening.clickTab1();
        }
    }
    @Click(R.id.btnTab2)
    void clickTab2(){
        if (mTabChangeListening!=null){
            mTabChangeListening.clickTab2();
        }
    }
    @Click(R.id.btnTab3)
    void clickTab3(){
        if (mTabChangeListening!=null){
            mTabChangeListening.clickTab3();
        }
    } @Click(R.id.btnTab4)
    void clickTab4(){
        if (mTabChangeListening!=null){
            mTabChangeListening.clickTab4();
        }
    }


    public void setTabChangeListening(TabChangeListening tabChangeListening){
        mTabChangeListening=tabChangeListening;
    }
   public interface TabChangeListening{
       void clickTab1();
       void clickTab2();
       void clickTab3();
       void clickTab4();
    }
}
