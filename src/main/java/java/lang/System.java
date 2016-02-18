/*
 * Copyright (c) 2005 Wolfgang Kuehn
 */

package java.lang;

import java.io.PrintStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;

import javascript.ScriptHelper;

import javax.script.ScriptEngine;

/**
 * The System class contains several useful class fields and methods. It cannot be instantiated.
 * 
 * @author com.j2js
 */
public final class System {

    /**
     * The "standard" error output stream. By default, the output is directed to the {@link ConsoleOutputStream}.
     */
    public static PrintStream  err;
    
    /**
     * The "standard" output stream. By default, the output is directed to the {@link ConsoleOutputStream}.
     */
    public static PrintStream  out;
    
    public static HashMap<String, String> properties = new HashMap<String, String>();

    public static ScriptEngine scriptEngine;
    
    private System() {}
    
    

    /**
     * Returns the current time in milliseconds.
     */
    public static long currentTimeMillis() {
        return ScriptHelper.evalLong("new Date().getTime()");
    }

    /**
     * Copies an array from the specified source array, beginning at the specified position,
     * to the specified position of the destination array.
     */
    public static void arraycopy(Object src, int srcPosition, Object dst, int dstPosition, int length) {
        Object[] srcArray = (Object[]) src;
        Object[] dstArray = (Object[]) dst;

        if (src == dst && srcPosition < dstPosition && srcPosition+length >= dstPosition) {
            for (int i=length-1; i>=0; i--) dstArray[dstPosition+i] = srcArray[srcPosition+i];
        } else {
            for (int i=0; i<length; i++) dstArray[dstPosition+i] = srcArray[srcPosition+i];
        }
    }

    /**
     * Gets the system property indicated by the specified key. On startup,
     * system properties are set through the URL query parameters.
     * 
     * @param key the name of the system property
     */
    public static String getProperty(String key) {
        return properties.get(key);
    }
    
    /**
     * Gets the system property indicated by the specified key. On startup,
     * system properties are set through the URL query parameters.
     * 
     * @param key the name of the system property
     */
    public static String getProperty(String key, String def) {
        String propertyValue = properties.get(key);
        if (propertyValue == null) return def;
        return propertyValue;
    }

    /**
     * Closes the window which is running this Java Virtual Machine.
     * 
     * @param status ignored
     */
    public static void exit(int status) {
        //Global.window.close();
    }

    /**
     * Runs the garbage collector.
     */
    public static void gc() {}
    

    
}
