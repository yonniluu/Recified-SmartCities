package com.example.thedata_minors.recified.login.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thedata_minors.recified.R;
import com.example.thedata_minors.recified.login.Model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


/**
 * Created by TheAhBooBoo on 2016-11-11.
 */

public class SignUpActivity extends AppCompatActivity {
    private final static String TAG = SignUpActivity.class.getSimpleName();
    private TextView mUsername , mPassword, mFname, mLname, mAge, mGender;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void Register(View view){
        mUsername = (TextView) findViewById(R.id.etEmail);
        mPassword = (TextView) findViewById(R.id.Password);
        mFname = (TextView) findViewById(R.id.firstname);
        mLname = (TextView) findViewById(R.id.lastname);
        mAge = (TextView) findViewById(R.id.etage);
        mGender = (TextView) findViewById(R.id.gender);

        String emailText = mUsername.getText().toString();
        String passwordText = mPassword.getText().toString();
        final String fNameText = mFname.getText().toString();
        final String lNameText = mLname.getText().toString();
        final int ageText = Integer.parseInt(mAge.getText().toString());
        final String genderText = mGender.getText().toString();

        mAuth.createUserWithEmailAndPassword(emailText, passwordText)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());
                        User newUser = new User(fNameText,lNameText,genderText,ageText);

                        // newUser.packUser();

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Toast.makeText(SignUpActivity.this, "Failed",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });

    }

}
