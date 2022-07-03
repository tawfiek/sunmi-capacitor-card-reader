package com.paywithspare.sunmicardreader.utils;

import android.os.Build;
import android.text.TextUtils;

public final class DeviceUtil {
    private DeviceUtil() {
        throw new AssertionError("create instance of DeviceUtil is prohibited");
    }

    public static boolean isP1N() {
        String model = getModel();
        return model.matches("p1n.*");
    }

    public static boolean isP14G() {
        String model = getModel();
        return model.matches("p1\\(4g\\).*");
    }

    public static boolean isP2Lite() {
        String model = getModel();
        return model.matches("p2lite.*");
    }

    public static boolean isP2Pro() {
        String model = getModel();
        return model.matches("p2_pro.*");
    }

    public static boolean isP2() {
        String model = getModel();
        return model.matches("p2.*");
    }

    public static String getModel() {
        String model = SystemPropertiesUtil.get("ro.sunmi.hardware");
        if (TextUtils.isEmpty(model)) {
            model = Build.UNKNOWN;
        }
        return model.toLowerCase();
    }
}
