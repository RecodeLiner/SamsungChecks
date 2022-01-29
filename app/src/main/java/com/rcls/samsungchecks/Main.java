package com.rcls.samsungchecks;

import de.robv.android.xposed.*;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class Main implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(final LoadPackageParam lpp) {
        XposedHelpers.setStaticObjectField(android.os.Build.class, "MANUFACTURER", "Google" );
    }
}