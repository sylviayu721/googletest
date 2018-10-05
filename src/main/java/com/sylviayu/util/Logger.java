package com.sylviayu.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * logging utilities
 *
 * @author Sylvia
 */

public class Logger {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");

    public static void Debug(String message) {
        System.out.println(dateFormat.format(new Date()) + " - " + message);
    }

    public static void Error(String message) {
        System.err.println(dateFormat.format(new Date()) + " - " + message);
    }
}
