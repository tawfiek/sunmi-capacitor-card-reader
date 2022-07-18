package com.paywithspare.sunmicardreader;

import android.content.Context;

import com.getcapacitor.Bridge;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.paywithspare.sunmicardreader.utils.LogUtil;

@CapacitorPlugin(name = "SunmiCardReader")
public class SunmiCardReaderPlugin extends Plugin {
    private SunmiCardReader implementation = new SunmiCardReader();


    @PluginMethod(returnType = PluginMethod.RETURN_CALLBACK)
    public void readCard (PluginCall call) {
        implementation.readCard(call);
    }

    @PluginMethod
    public void closeCardReader (PluginCall call) {
        implementation.closeCardReader(call);
    }

    @PluginMethod
    public void getDeviceModel (PluginCall call) {
        try {
            JSObject response = implementation.getDeviceModel();

            call.resolve(response);
        } catch (Exception e) {
            LogUtil.e("Getting Device Model ", e.getMessage());
            call.reject("Can not get the device model", e);
        }
    }

    @PluginMethod
    public void initSunmiSDK (PluginCall call) {
        try {
            Context applicationContext = this.getActivity().getApplicationContext();
            final boolean isInitilized  = implementation.initSunmiSDK(applicationContext);
            if (isInitilized) {
                call.resolve();
            }
        } catch (Exception e) {
            call.reject("Can not initialize payment kernel");
        }
    }
}
