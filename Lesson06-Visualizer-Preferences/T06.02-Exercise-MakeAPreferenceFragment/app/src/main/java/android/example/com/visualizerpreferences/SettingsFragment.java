package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by Daniel on 15.02.2017.
 */

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle b, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
