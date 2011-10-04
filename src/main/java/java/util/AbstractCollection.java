package java.util;


public abstract class AbstractCollection<T> implements Collection<T>, Iterable<T> {

    public abstract Iterator<T> iterator();
    
    /**
     * Returns the number of elements in this collection.
     */
    public abstract int size();
    
    
    /**
     * Returns an array containing all of the elements in this list in the correct order.
     */
    public T[] toArray() {
        return toArray((T[]) new Object[size()]);
    }

    /**
     * Returns an array containing all of the elements in this list in the correct order.
     */
    public T[] toArray(T[] target) {
        int size = size();
        if (target.length < size) target = (T[]) new Object[size];
        int i = 0;
        for (T element : this) {
            target[i++] = element;
        }
        if (target.length > size) target[size] = null;
        return target;
    }
    
    /**
     * Returns a string representation of this collection.
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append('[');
        int i = 0;
        for (T element : this) {
            if (i++>0) buffer.append(", ");
            buffer.append(element);
        }
        buffer.append(']');
        return buffer.toString();
    }
}
