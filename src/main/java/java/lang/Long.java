package java.lang;

import javascript.ScriptHelper;

/**
 * The Long class wraps a value of the primitive type long in an object. 
 * 
 * @author j2js.com
 */
public final class Long {
    
    public static final Class<Long> TYPE = null;
    
    private long value;
    
    /**
     * Constructs a newly allocated Long object that represents the specified long argument.
     */
    public Long(long l) {
        value = l;
    }
    
    /**
     * Compares this object to the specified object.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Long)) return false;
        return ((Long) obj).value == value;
    }
    
    
    /**
     * Returns an Long object holding the specified value. Calls to this
     * method may be generated by the autoboxing feature.
     */
    public static Long valueOf(long value) {
        return new Long(value);
    }
    
    /**
     * Returns the value of this Long as a long.
     */
    public long longValue() {
        return value;
    }
    
    /**
     * Returns a String object representing this Long's value.
     */
    public String toString() {
        // Duplicate code to String#valueOf(long)
        ScriptHelper.put("l", value);
        return (String) ScriptHelper.eval("String(l)");
    }

    
}
