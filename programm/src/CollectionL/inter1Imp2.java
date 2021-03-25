package CollectionL;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author datefate
 * @site create 2021-03-21-上午11:10
 */
public class inter1Imp2 implements inter1{
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection collection) {
        return false;
    }

    public void clear() {

    }

    public boolean retainAll(Collection collection) {
        return false;
    }

    public boolean removeAll(Collection collection) {
        return false;
    }

    public boolean containsAll(Collection collection) {
        return false;
    }

    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }
}
