package com.util;

/**
 * Created by Wzj on 2017/5/22 0022.
 */
public class Logs {

    static {
        System.out.println("Logs init...");
    }

    public static void info(String str) {
        System.out.println("INFO: " + str);
    }

    public static void warn(String str) {
        System.out.println("WARN: " + str);
    }
}
