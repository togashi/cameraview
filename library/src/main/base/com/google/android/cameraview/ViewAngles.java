package com.google.android.cameraview;

import java.util.Locale;

public class ViewAngles {
    private final float mHorizontal;
    private final float mVertical;

    public static ViewAngles fromRadians(float h, float v) {
        return new ViewAngles((float) Math.toDegrees(h), (float) Math.toDegrees(v));
    }

    private ViewAngles(float horizontal, float vertical) {
        mHorizontal = horizontal;
        mVertical = vertical;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "ViewAngles(horizontal:%1.2f, vertical:%1.2f)", mHorizontal, mVertical);
    }
}
