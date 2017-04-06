package com.kit.my01;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by foko on 2017/3/28.
 */

public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView textView = new TextView(this);
//        textView.setText("我是主页面");
//        textView.setTextSize(30);
//        textView.setGravity(Gravity.CENTER);
//        textView.setTextColor(Color.RED);
//        setContentView(textView);
        setContentView(R.layout.activity_main);
    }

    Dialog dialog;

    public void btnClick(View v) {
        LayoutInflater inflater = LayoutInflater.from(this);
        View myView = inflater.inflate(R.layout.layout_mysend_dialog, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(myView);

        myView.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
               Toast.makeText(MainActivity.this,"点击了确定",Toast.LENGTH_LONG).show();

            }
        });

        dialog =builder.create();
        dialog.show();

    }

}
