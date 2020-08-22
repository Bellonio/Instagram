/*App that I made for myself because I often open Instagram but forgetting to switch on WiFi Network
and so i consume a lot of Mobile Network 's MB*/

package com.bellone.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private WifiManager wifiManager = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();

        wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        if(wifiManager.getWifiState() != WifiManager.WIFI_STATE_ENABLED){
            wifiManager.setWifiEnabled(true);
        }

        Intent intent = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
        startActivity(intent);
    }
}
