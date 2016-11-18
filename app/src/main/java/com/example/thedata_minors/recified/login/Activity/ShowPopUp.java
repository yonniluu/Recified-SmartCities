package com.example.thedata_minors.recified.login.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class ShowPopUp extends Activity {



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Confirm?")
                .setContentText("Checking in at Surrey Leisure center for basketball")
                .setCancelText("Cancel")
                .setConfirmText("Confirm")
                .showCancelButton(true)
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog.cancel();
                    }
                })
                .show();

        Intent goBackIntent = new Intent(getApplicationContext(),CheckIn.class);
        startActivity(goBackIntent);

    }
}