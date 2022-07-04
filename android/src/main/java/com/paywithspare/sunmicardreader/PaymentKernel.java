package com.paywithspare.sunmicardreader;

import android.content.Context;
import com.paywithspare.sunmicardreader.utils.LogUtil;
import com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2;
import com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2;
import com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2;
import com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2;
import com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2;
import com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2;
import com.sunmi.pay.hardware.aidlv2.system.BasicOptV2;
import com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2;

import sunmi.paylib.SunmiPayKernel;

public class PaymentKernel {
    public static BasicOptV2 basicOptV2;
    public static ReadCardOptV2 readCardOptV2;
    public static PinPadOptV2 pinPadOptV2;
    public static SecurityOptV2 securityOptV2;
    public static EMVOptV2 emvOptV2;
    public static TaxOptV2 taxOptV2;
    public static ETCOptV2 etcOptV2;
    public static PrinterOptV2 printerOptV2;
    public static boolean isConnectPaySDK;
    public static Context context;


    protected static String TAG = "SunmiCardReader";

    final private static SunmiPayKernel payKernel = SunmiPayKernel.getInstance();

    final static SunmiPayKernel.ConnectCallback sunmiPayKernelCallback =  new SunmiPayKernel.ConnectCallback() {
        @Override
        public void onConnectPaySDK() {
            LogUtil.e(TAG, "onConnectPaySDK...");
            emvOptV2 = payKernel.mEMVOptV2;
            basicOptV2 = payKernel.mBasicOptV2;
            pinPadOptV2 = payKernel.mPinPadOptV2;
            readCardOptV2 = payKernel.mReadCardOptV2;
            securityOptV2 = payKernel.mSecurityOptV2;
            taxOptV2 = payKernel.mTaxOptV2;
            etcOptV2 = payKernel.mETCOptV2;
            printerOptV2 = payKernel.mPrinterOptV2;
            isConnectPaySDK = true;
        }

        @Override
        public void onDisconnectPaySDK() {
            LogUtil.e(TAG, "onDisconnectPaySDK...");
            isConnectPaySDK = false;
            emvOptV2 = null;
            basicOptV2 = null;
            pinPadOptV2 = null;
            readCardOptV2 = null;
            securityOptV2 = null;
            taxOptV2 = null;
            etcOptV2 = null;
            printerOptV2 = null;
        }
    };

    /** bind PaySDK service */
    public static void initPayKernel(Context context) {
            payKernel.initPaySDK(context, PaymentKernel.sunmiPayKernelCallback);
    }

    public boolean isConnected() {
        return this.isConnectPaySDK;
    }


}
