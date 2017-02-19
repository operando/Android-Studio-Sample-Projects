package com.os.operando.googleadsbanner;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Remove the below line after defining your own ad unit ID.
    private static final String TOAST_TEXT = "Test ads are being shown. "
            + "To show live ads, replace the ad unit ID in res/values/strings.xml with your own ad unit ID.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        // Toasts the test ad message on the screen. Remove this after defining your own ad unit ID.
        Toast.makeText(this, TOAST_TEXT, Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
