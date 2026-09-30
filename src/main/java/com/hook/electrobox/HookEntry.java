package com.hook.electrobox;

import android.widget.TextView;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;

public class HookEntry implements IXposedHookLoadPackage {
    private static final String TAG = "ElectroBoxHook";
    private static final String PKG = "com.duracodefactory.electrobox.electronics";

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {
        if (!lpparam.packageName.equals(PKG)) return;
        XposedBridge.log(TAG + ": hooked " + PKG);

        // ====== Premium Bypass ======
        try {
            XposedHelpers.findAndHookMethod("H1.n", lpparam.classLoader, "d",
                new XC_MethodHook() {
                    @Override protected void beforeHookedMethod(MethodHookParam p) {
                        p.setResult(true);
                    }
                });
            XposedHelpers.findAndHookMethod("H1.n", lpparam.classLoader, "c",
                new XC_MethodHook() {
                    @Override protected void beforeHookedMethod(MethodHookParam p) {
                        p.setResult(true);
                    }
                });
            XposedHelpers.findAndHookMethod("I0.d", lpparam.classLoader, "b",
                new XC_MethodHook() {
                    @Override protected void beforeHookedMethod(MethodHookParam p) {
                        p.setResult(true);
                    }
                });
            XposedBridge.log(TAG + ": premium OK");
        } catch (Throwable t) {
            XposedBridge.log(TAG + ": premium FAIL");
        }

        // ====== CN1: Resources.getString(int) ======
        try {
            XposedHelpers.findAndHookMethod("android.content.res.Resources", null,
                "getString", int.class, new XC_MethodHook() {
                    @Override protected void afterHookedMethod(MethodHookParam p) {
                        try {
                            int id = (int) p.args[0];
                            if ((id >>> 24) != 0x7f) return;
                            String o = (String) p.getResult();
                            if (o == null) return;
                            String z = ChinesePatch.getTranslation(o);
                            if (z != null) p.setResult(z);
                        } catch (Throwable ignored) {}
                    }
                });
            XposedBridge.log(TAG + ": hook1 OK");
        } catch (Throwable t) {
            XposedBridge.log(TAG + ": hook1 FAIL");
        }

        // ====== CN2: Resources.getText(int) ======
        try {
            XposedHelpers.findAndHookMethod("android.content.res.Resources", null,
                "getText", int.class, new XC_MethodHook() {
                    @Override protected void afterHookedMethod(MethodHookParam p) {
                        try {
                            int id = (int) p.args[0];
                            if ((id >>> 24) != 0x7f) return;
                            CharSequence o = (CharSequence) p.getResult();
                            if (o == null) return;
                            String z = ChinesePatch.getTranslation(o.toString());
                            if (z != null) p.setResult(z);
                        } catch (Throwable ignored) {}
                    }
                });
            XposedBridge.log(TAG + ": hook2 OK");
        } catch (Throwable t) {
            XposedBridge.log(TAG + ": hook2 FAIL");
        }

        // ====== CN3: Resources.getString(int, Object...) ======
        try {
            XposedHelpers.findAndHookMethod("android.content.res.Resources", null,
                "getString", int.class, Object[].class, new XC_MethodHook() {
                    @Override protected void afterHookedMethod(MethodHookParam p) {
                        try {
                            int id = (int) p.args[0];
                            if ((id >>> 24) != 0x7f) return;
                            String o = (String) p.getResult();
                            if (o == null) return;
                            String z = ChinesePatch.getTranslation(o);
                            if (z != null) p.setResult(z);
                        } catch (Throwable ignored) {}
                    }
                });
            XposedBridge.log(TAG + ": hook3 OK");
        } catch (Throwable t) {
            XposedBridge.log(TAG + ": hook3 FAIL");
        }

        // ====== CN4: TextView.setText(CharSequence) ======
        try {
            XposedHelpers.findAndHookMethod(TextView.class, "setText",
                CharSequence.class, new XC_MethodHook() {
                    @Override protected void afterHookedMethod(MethodHookParam p) {
                        try {
                            CharSequence o = (CharSequence) p.getResult();
                            if (o == null) return;
                            String s = o.toString();
                            if (s.isEmpty() || s.length() > 2000) return;
                            String z = ChinesePatch.getTranslation(s);
                            if (z != null) p.setResult(z);
                        } catch (Throwable ignored) {}
                    }
                });
            XposedBridge.log(TAG + ": hook4 OK");
        } catch (Throwable t) {
            XposedBridge.log(TAG + ": hook4 FAIL");
        }

        // ====== CN5: CursorWindow.getString() - DB content ======
        try {
            XposedHelpers.findAndHookMethod("android.database.CursorWindow", null,
                "getString", int.class, new XC_MethodHook() {
                    @Override protected void afterHookedMethod(MethodHookParam p) {
                        try {
                            String o = (String) p.getResult();
                            if (o == null) return;
                            if (o.length() < 3 || o.length() > 2000) return;
                            if (o.startsWith("com.") || o.startsWith("http")) return;
                            String z = ChinesePatch.getTranslation(o);
                            if (z != null) p.setResult(z);
                        } catch (Throwable ignored) {}
                    }
                });
            XposedBridge.log(TAG + ": hook5 OK");
        } catch (Throwable t) {
            XposedBridge.log(TAG + ": hook5 FAIL: " + t.getMessage());
            // Fallback
            try {
                XposedHelpers.findAndHookMethod("android.database.AbstractCursor", null,
                    "getString", int.class, new XC_MethodHook() {
                        @Override protected void afterHookedMethod(MethodHookParam p) {
                            try {
                                String o = (String) p.getResult();
                                if (o == null) return;
                                if (o.length() < 3 || o.length() > 2000) return;
                                if (o.startsWith("com.") || o.startsWith("http")) return;
                                String z = ChinesePatch.getTranslation(o);
                                if (z != null) p.setResult(z);
                            } catch (Throwable ignored) {}
                        }
                    });
                XposedBridge.log(TAG + ": hook5-fallback OK");
            } catch (Throwable t2) {
                XposedBridge.log(TAG + ": hook5 ALL FAIL");
            }
        }

        // ====== CN6: Activity.setContentView - catch Activity titles ======
        try {
            XposedHelpers.findAndHookMethod("android.app.Activity", null,
                "setTitle", CharSequence.class, new XC_MethodHook() {
                    @Override protected void beforeHookedMethod(MethodHookParam p) {
                        try {
                            CharSequence o = (CharSequence) p.args[0];
                            if (o == null) return;
                            String s = o.toString();
                            String z = ChinesePatch.getTranslation(s);
                            if (z != null) p.args[0] = z;
                        } catch (Throwable ignored) {}
                    }
                });
            XposedBridge.log(TAG + ": hook6 Activity.setTitle OK");
        } catch (Throwable t) {
            XposedBridge.log(TAG + ": hook6 FAIL");
        }

        XposedBridge.log(TAG + ": ALL hooks installed, dict=" + ChinesePatch.getCount());
    }
}
