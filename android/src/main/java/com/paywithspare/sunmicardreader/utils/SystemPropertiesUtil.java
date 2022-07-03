package com.paywithspare.sunmicardreader.utils;

import android.annotation.SuppressLint;

import java.lang.reflect.Method;

public final class SystemPropertiesUtil {
    private SystemPropertiesUtil() {
        throw new AssertionError();
    }

    /**
     * Get the value for the given key.
     *
     * @return an empty string if the key isn't found
     */
    public static String get(String key) {
        try {
            @SuppressLint("PrivateApi")
            Class clazz = Class.forName("android.os.SystemProperties");
            @SuppressWarnings("unchecked")
            Method method = clazz.getDeclaredMethod("get", String.class);
            method.setAccessible(true);
            return (String) method.invoke(null, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get the value for the given key.
     *
     * @return if the key isn't found, return def if it isn't null, or an empty string otherwise
     */
    public static String get(String key, String def) {
        try {
            @SuppressLint("PrivateApi")
            Class clazz = Class.forName("android.os.SystemProperties");
            @SuppressWarnings("unchecked")
            Method method = clazz.getDeclaredMethod("get", String.class, String.class);
            method.setAccessible(true);
            return (String) method.invoke(null, key, def);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get the value for the given key, and return as an integer.
     *
     * @param key the key to lookup
     * @param def a default value to return
     * @return the key parsed as an integer, or def if the key isn't found or
     * cannot be parsed
     */
    public static int getInt(String key, int def) {
        try {
            @SuppressLint("PrivateApi")
            Class clazz = Class.forName("android.os.SystemProperties");
            @SuppressWarnings("unchecked")
            Method method = clazz.getDeclaredMethod("getInt", String.class, int.class);
            method.setAccessible(true);
            return (int) method.invoke(null, key, def);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Get the value for the given key, and return as a long.
     *
     * @param key the key to lookup
     * @param def a default value to return
     * @return the key parsed as a long, or def if the key isn't found or
     * cannot be parsed
     */
    public static long getLong(String key, long def) {
        try {
            @SuppressLint("PrivateApi")
            Class clazz = Class.forName("android.os.SystemProperties");
            @SuppressWarnings("unchecked")
            Method method = clazz.getDeclaredMethod("getLong", String.class, long.class);
            method.setAccessible(true);
            return (long) method.invoke(null, key, def);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Get the value for the given key, returned as a boolean.
     * Values 'n', 'no', '0', 'false' or 'off' are considered false.
     * Values 'y', 'yes', '1', 'true' or 'on' are considered true.
     * (case sensitive).
     * If the key does not exist, or has any other value, then the default
     * result is returned.
     *
     * @param key the key to lookup
     * @param def a default value to return
     * @return the key parsed as a boolean, or def if the key isn't found or is
     * not able to be parsed as a boolean.
     */
    public static boolean getBoolean(String key, boolean def) {
        try {
            @SuppressLint("PrivateApi")
            Class clazz = Class.forName("android.os.SystemProperties");
            @SuppressWarnings("unchecked")
            Method method = clazz.getDeclaredMethod("getBoolean", String.class, boolean.class);
            method.setAccessible(true);
            return (boolean) method.invoke(null, key, def);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Set the value for the given key.
     */
    public static void set(String key, String val) {
        try {
            @SuppressLint("PrivateApi")
            Class clazz = Class.forName("android.os.SystemProperties");
            @SuppressLint("DiscouragedPrivateApi")
            @SuppressWarnings("unchecked")
            Method method = clazz.getDeclaredMethod("set", String.class, String.class);
            method.setAccessible(true);
            method.invoke(null, key, val);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 注册属性变化监听对象
     *
     * @param callback 监听对象
     */
    public static void addChangeCallback(Runnable callback) {
        try {
            @SuppressLint("PrivateApi")
            Class clazz = Class.forName("android.os.SystemProperties");
            @SuppressLint("DiscouragedPrivateApi")
            @SuppressWarnings("unchecked")
            Method method = clazz.getDeclaredMethod("addChangeCallback", Runnable.class);
            method.setAccessible(true);
            method.invoke(null, callback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
