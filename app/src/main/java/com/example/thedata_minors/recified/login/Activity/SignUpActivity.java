package com.example.thedata_minors.recified.login.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.thedata_minors.recified.R;
import com.google.firebase.auth.FirebaseAuth;


/**
 * Created by TheAhBooBoo on 2016-11-11.
 */

public class SignUpActivity extends AppCompatActivity {
    private final static String TAG = MainActivity.class.getSimpleName();
    private TextView mUsername , mPassword, mFname, mLname, mAge, mGender;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

}
