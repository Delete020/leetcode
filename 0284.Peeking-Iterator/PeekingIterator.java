import java.util.Iterator;

/**
 * @author Delete020
 * @since 5/17/22 8:38 PM
 */
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer peek = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        peek = iterator.next();
    }


    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return peek;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int temp = peek;
        peek = iterator.hasNext() ? iterator.next() : null;
        return temp;
    }

    @Override
    public boolean hasNext() {
        return peek != null;
    }
}
