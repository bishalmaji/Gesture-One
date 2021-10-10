package com.backupbuddy.gestureone;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast {
    Activity activity;
    String makeText;
    View viewlay;
    public CustomToast(Activity activity,String makeText) {
        this.activity = activity;
        this.makeText=makeText;
    }
    public void ShowToast(){
        LayoutInflater layoutInflater=activity.getLayoutInflater();
        viewlay=layoutInflater.inflate(R.layout.tost_custom,(ViewGroup)activity.findViewById(R.id.toast_custom),false);
        TextView textToast=viewlay.findViewById(R.id.textcustomt);
        textToast.setText(makeText);
        Toast toast=Toast.makeText(activity,"",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP,0,150);
        toast.setView(viewlay);
        toast.show();

    }
}
