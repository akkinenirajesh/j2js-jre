/*
 * Copyright (c) 2005 Wolfgang Kuehn
 */

package java.lang;

import javascript.ScriptHelper;

/**
 * The class Math contains methods for performing basic numeric operations such as the elementary exponential,
 * logarithm, square root, and trigonometric functions.
 */
public final class Math {

    /**
     * The double value that is closer than any other to e, the base of the natural logarithms.
     */
    public static double E;
    
    /**
     * The double value that is closer than any other to pi, the ratio of the circumference
     * of a circle to its diameter.
     */
    public static  double PI; 

    static {
        E = ScriptHelper.evalDouble("Math.E");
        PI = ScriptHelper.evalDouble("Math.PI");
    }
    
    private Math() {}

    /**
     * Returns the trigonometric sine of an angle.
     */
    public static double sin(double a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalDouble("Math.sin(a)");
    }

    /**
     * Returns the trigonometric cosine of an angle. 
     */
    public static double cos(double a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalDouble("Math.cos(a)");
    }

    /**
     * Returns the trigonometric tangent of an angle.
     */
    public static double tan(double a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalDouble("Math.tan(a)");
    }
    
    /**
     * Returns the arc sine of a value; the returned angle is in the range -pi/2 through pi/2.
     */
    public static double asin(double a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalDouble("Math.asin(a)");
    }

    /**
     * Returns the arc cosine of a value; the returned angle is in the range 0.0 through pi.
     */
    public static double acos(double a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalDouble("Math.acos(a)");
    }
    
    /**
     * Returns the arc tangent of a value; the returned angle is in the range -pi/2 through pi/2.
     */
    public static double atan(double a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalDouble("Math.atan(a)");
    }

    /**
     * Converts an angle measured in degrees to an approximately equivalent angle measured in radians.
     */
    public static double toRadians(double angdeg) {
        return angdeg * PI / 180;
    }

    /**
     * Converts an angle measured in radians to an approximately equivalent angle measured in degrees.
     */
    public static double toDegrees(double angrad) {
        return angrad * 180 / PI;
    }

    /**
     * Returns the correctly rounded positive square root of a double value.
     */
    public static double sqrt(double a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalDouble("Math.sqrt(a)");
    }

    /**
     * Returns the smallest (closest to negative infinity) double value that is greater than
     * or equal to the argument and is equal to a mathematical integer.
     */
    public static double ceil(double a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalDouble("Math.ceil(a)");
    }

    /**
     * Returns the largest (closest to positive infinity) double value that is less than
     * or equal to the argument and is equal to a mathematical integer.
     */
    public static double floor(double a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalDouble("Math.floor(a)");
    }
    
    /**
     * Returns the closest int to the argument.
     */
    public static int round(double a) {
        return (int) Math.floor(a + 0.5);
    }

    /**
     * Returns the absolute value of an int value.
     */
    public static int abs(int a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalInt("Math.abs(a)");
    }

    /**
     * Returns the absolute value of a long value.
     */
    public static long abs(long a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalLong("Math.abs(a)");
    }

    /**
     * Returns the absolute value of a float value.
     */
    public static float abs(float a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalFloat("Math.abs(a)");
    }

    /**
     * Returns the absolute value of a double value.
     */
    public static double abs(double a) {
        ScriptHelper.put("a", a);
        return ScriptHelper.evalDouble("Math.abs(a)");
    }
    
    /**
     * Returns the greater of two int values.
     */
    public static int max(int a, int b) {
        ScriptHelper.put("a", a);
        ScriptHelper.put("b", b);
        return ScriptHelper.evalInt("Math.max(a, b)");
    }

    /**
     * Returns the greater of two long values.
     */
    public static long max(long a, long b) {
        ScriptHelper.put("a", a);
        ScriptHelper.put("b", b);
        return ScriptHelper.evalLong("Math.max(a, b)");
    }

    /**
     * Returns the greater of two float values.
     */
    public static float max(float a, float b) {
        ScriptHelper.put("a", a);
        ScriptHelper.put("b", b);
        return ScriptHelper.evalFloat("Math.max(a, b)");
    }

    /**
     * Returns the greater of two double values.
     */
    public static double max(double a, double b) {
        ScriptHelper.put("a", a);
        ScriptHelper.put("b", b);
        return ScriptHelper.evalDouble("Math.max(a, b)");
    }

    /**
     * Returns the smaller of two int values.
     */
    public static int min(int a, int b) {
        ScriptHelper.put("a", a);
        ScriptHelper.put("b", b);
        return ScriptHelper.evalInt("Math.min(a, b)");
    }

    /**
     * Returns the smaller of two long values.
     */
    public static long min(long a, long b) {
        ScriptHelper.put("a", a);
        ScriptHelper.put("b", b);
        return ScriptHelper.evalLong("Math.min(a, b)");
    }

    /**
     * Returns the smaller of two float values.
     */
    public static float min(float a, float b) {
        ScriptHelper.put("a", a);
        ScriptHelper.put("b", b);
        return ScriptHelper.evalFloat("Math.min(a, b)");
    }

    /**
     * Returns the smaller of two double values.
     */
    public static double min(double a, double b) {
        ScriptHelper.put("a", a);
        ScriptHelper.put("b", b);
        return ScriptHelper.evalDouble("Math.min(a, b)");
    }

    /**
     * Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
     */
    public static double random() {
        return ScriptHelper.evalDouble("Math.random()"); 
    }
    
    
}
