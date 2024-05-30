package com.bdd.FrontEnd;

import com.bdd.FrontEnd.utility.ExtentReportUtil;
import com.bdd.FrontEnd.utility.FileHelper;


public class Listener {

    private static boolean SE_BORRARON_FILES = false;

    public void onTestStart(String nombre) {
        try {
            ExtentReportUtil.INSTANCE.createTest(nombre);
        } catch (Exception e) {
            System.out.println("[ERROR] Error en onTestStart: " + e.getMessage());
        }
    }

    public void onStart() {
        if (!SE_BORRARON_FILES) {
            FileHelper.borrarElementosFolder("/img");
            SE_BORRARON_FILES = true;
        }
    }

    public void onFinish() {
        ExtentReportUtil.INSTANCE.flushReport();
    }
}
