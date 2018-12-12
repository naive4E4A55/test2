package com.tortel.syslog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.tortel.syslog.dialog.AboutDialog;
import com.tortel.syslog.dialog.AboutLogcatDialog;
import com.tortel.syslog.dialog.ClearBufferDialog;
import com.tortel.syslog.dialog.FaqDialog;
import com.tortel.syslog.fragment.MainFragment;
import com.tortel.syslog.utils.Log;
import com.tortel.syslog.utils.Prefs;
import com.tortel.syslog.utils.Utils;
import com.tortel.syslog.dialog.ShowAppDialog;

import java.util.List;

import pub.devrel.easypermissions.EasyPermissions;

import android.view.View;
import android.widget.*;
import com.tortel.syslog.appInformation;
import com.tortel.syslog.myAppInformation;
public class appMainFrame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_main_frame);

    }


    public void myOnClick(View view) {
        //appInformation dialog = new appInformation();
        //dialog.showDialog(R.id.button);
        startActivity(new Intent(this,myAppInformation.class));
        //dialog.show(getSupportFragmentManager(), "about");
    }
}
