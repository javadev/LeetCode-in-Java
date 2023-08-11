package g0201_0300.s0284_peeking_iterator;

// #Medium #Array #Design #Iterator #2022_07_06_Time_6_ms_(72.91%)_Space_43.3_MB_(14.85%)

import java.util.Iterator;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

public class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> it;
    private Integer current;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        it = iterator;
        current = it.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (current == null) {
            current = it.next();
        }
        return current;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer temp = current;
        current = it.hasNext() ? it.next() : null;
        return temp;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }
}
