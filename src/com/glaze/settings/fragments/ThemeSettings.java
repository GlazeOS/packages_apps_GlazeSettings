package com.glaze.settings.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class ThemeSettings extends SettingsPreferenceFragment implements
        Preference.OnPreferenceChangeListener {

    @Override
    public void onCreate() {
      Intent themesIntent = new Intent();
      themesIntent.setClassName("projekt.substratum", "projekt.substratum.LaunchActivity");
      startActivity(themesIntent);
    }
}
