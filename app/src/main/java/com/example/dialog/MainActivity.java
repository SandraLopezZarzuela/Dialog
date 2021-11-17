package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity  extends FragmentActivity
        implements FireMissilesDialogFragment.NoticeDialogListener {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.texto);
    }

    public void verDialog(View view) {
        DialogFragment dialog = new FireMissilesDialogFragment();
        dialog.show(getSupportFragmentManager(), "NoticeDialogFragment");
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        // User touched the dialog's positive button
        tv.setText("Se disparan los misiles");

    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        tv.setText("No se disparan los misiles");

    }





}