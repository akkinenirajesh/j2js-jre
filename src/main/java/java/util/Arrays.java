package java.util;

import javascript.ScriptHelper;

public class Arrays {
    
    /**
     * Returns a fixed-size list backed by the specified array.
     * @param a the array by which the list will be backed.
     * @return list view of the specified array.
     */
    public static List asList(Object[] a) {
        ArrayList vector = new ArrayList();
        for (int i=0; i<a.length; i++) {
            vector.add(a[i]);
        }
        return vector;
    }
    
    /**
     * Returns true if the two specified arrays of Objects are equal to one another.
     */
    public static boolean equals(Object[] a1, Object[] a2) {
        if (a1 == null && a2 == null) return true;
        if (a1 == null || a2 == null || a1.length != a2.length) return false;

        int count = a1.length;
        for (int i=0; i<count; i++) {
            Object e1 = a1[i];
            Object e2 = a2[i];
            if (!(e1==null ? e2==null : e1.equals(e2))) return false;
        }
        
        return true;
    }
    
    /**
     *  Sorts the specified array of objects into ascending order, according to the natural ordering of its elements.
     *  <br/>
     *  <b>Important</b>: This is a restriction of the Java API sort(Object[]) function.
     */
    public static void sort(Object[] array) {
        ScriptHelper.put("array", array);
        ScriptHelper.eval("array.sort()");
    }
    
    /**
     * Sorts the specified array of objects according to the order induced by the specified comparator.
     */
    public static <T> void sort(T[] array, Comparator<? super T> c) {
        ScriptHelper.put("array", array);
        ScriptHelper.put("c", c);
        ScriptHelper.eval("array.sort(function(o1, o2) {return j2js.invoke(c, 'compare(java.lang.Object,java.lang.Object)int', [o1, o2])})");
    }
    
}
