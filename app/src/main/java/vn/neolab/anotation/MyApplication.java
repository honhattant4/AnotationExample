package vn.neolab.anotation;

import android.app.Application;
import android.util.Log;

import org.androidannotations.annotations.EApplication;

/**
 * Created by NLDN_HoNhatTan on 6/3/2016.
 */
@EApplication
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(MyApplication.class.getSimpleName(),"onCreate");
    }
    public void test(){
        Log.d(MyApplication.class.getSimpleName(),"test");
    }
}
