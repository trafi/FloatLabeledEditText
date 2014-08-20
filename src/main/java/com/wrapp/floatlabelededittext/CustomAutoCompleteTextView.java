package com.wrapp.floatlabelededittext;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

/**
 * Created by tadas on 20/08/14.
 */
public class CustomAutoCompleteTextView extends AutoCompleteTextView {

    private EnaughToFilterCallback mCallback;

    public interface EnaughToFilterCallback {
        public boolean enoughToFilter();
    }

    public CustomAutoCompleteTextView(Context context) {
        super(context);
    }

    public CustomAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomAutoCompleteTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean enoughToFilter() {
        if (mCallback != null) {
            return mCallback.enoughToFilter();
        }

        return true;
    }

    public void setEnaughToFilterCallback(EnaughToFilterCallback callback) {
        mCallback = callback;
    }
}
