package com.rninlocodemo;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.inlocomedia.android.ads.InLocoMedia;
import com.inlocomedia.android.ads.InLocoMediaOptions;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "RNInLocoDemo";
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // In Loco Media SDK Init
        InLocoMediaOptions options = InLocoMediaOptions.getInstance(this);

        // The AppId you acquired in earlier steps
        options.setAdsKey("YOUR_APP_ID");

        // Verbose mode flag, if this is set as true InLocoMedia SDK will let you know about errors on the Logcat
        options.setLogEnabled(true);

        // Development Devices set here are only going to receive test ads
        options.setDevelopmentDevices("Devices_ids");

        InLocoMedia.init(this, options);
    }
}
