package com.example.thedata_minors.recified.login;

import android.support.v4.app.FragmentActivity;

/**
 * Created by TheAhBooBoo on 2016-11-06.
 */

public interface PresenterAndView {
    interface Presenter{
        void onCreate(FragmentActivity context);
        void onStart();
        void onStop();
        void signIn();
    }

    interface View{
        void showEmailError();
        void showUsernameError();
        void showIncorrectPasswordError();
    }
}
