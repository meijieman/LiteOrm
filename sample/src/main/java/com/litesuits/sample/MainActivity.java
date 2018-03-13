package com.litesuits.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.litesuits.orm.LiteOrm;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LiteOrm mLiteOrm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1).setOnClickListener(this);

        mLiteOrm = LiteOrm.newSingleInstance(this, "sample.db");
        mLiteOrm.setDebugged(true);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:

                break;
            default:

                break;
        }
    }
}
