package vn.neolab.anotation.sharedpreferences;

import org.androidannotations.annotations.sharedpreferences.DefaultBoolean;
import org.androidannotations.annotations.sharedpreferences.DefaultInt;
import org.androidannotations.annotations.sharedpreferences.DefaultString;
import org.androidannotations.annotations.sharedpreferences.SharedPref;

/**
 * Created by NLDN_HoNhatTan on 6/3/2016.
 */
@SharedPref(value = SharedPref.Scope.UNIQUE)
public interface Preference {
    @DefaultBoolean(false)
    boolean created();

    @DefaultInt(0)
    int countCreated();

    @DefaultString("Tan")
    String name();

}