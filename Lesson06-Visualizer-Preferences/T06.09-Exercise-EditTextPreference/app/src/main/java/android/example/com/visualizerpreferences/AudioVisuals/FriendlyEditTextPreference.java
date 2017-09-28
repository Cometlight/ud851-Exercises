package android.example.com.visualizerpreferences.AudioVisuals;

import android.content.Context;
import android.support.v7.preference.EditTextPreference;
import android.text.TextUtils;
import android.util.AttributeSet;

/**
 * Created by Daniel on 16.02.2017.
 */

public class FriendlyEditTextPreference extends EditTextPreference {
    public FriendlyEditTextPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public FriendlyEditTextPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public FriendlyEditTextPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FriendlyEditTextPreference(Context context) {
        super(context);
    }

    @Override
    public CharSequence getSummary() {
        String text = getText();
        if (TextUtils.isEmpty(text)) {
            return null; // only working with non-support EditTexPreference getEditText().getHint();
        } else {
            CharSequence summary = super.getSummary();
            if (summary != null) {
                return String.format(summary.toString(), text);
            } else {
                return null;
            }
        }
    }
}
