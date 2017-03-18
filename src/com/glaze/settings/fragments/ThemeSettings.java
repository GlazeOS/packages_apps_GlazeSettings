package com.glaze.settings.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.settings.SettingsPreferenceFragment;
import android.os.Bundle;
import android.content.ComponentName;

import com.android.internal.logging.MetricsLogger;
import com.android.internal.logging.MetricsProto.MetricsEvent;

public class ThemeSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Intent intent = new Intent(Intent.ACTION_MAIN, null);
        //intent.setComponent(ComponentName.unflattenFromString("projekt.substratum", "projekt.substratum.LaunchActivity");
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        final ComponentName cn = new ComponentName("projekt.substratum", "projekt.substratum.LaunchActivity");
        intent.setComponent(cn);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.GLAZE_SETTINGS;
    }
}
