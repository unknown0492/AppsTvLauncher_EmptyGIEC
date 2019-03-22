package com.excel.appstvlauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.excel.excelclasslibrary.UtilShell;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d( "asshole", "aaaa " );
        UtilShell.executeShellCommandWithOp( "input keyevent 3" );
        //UtilMisc.startApplicationUsingPackageName( this, "com.excel.appstvlauncher.secondgen" );
        finish();
    }
}
