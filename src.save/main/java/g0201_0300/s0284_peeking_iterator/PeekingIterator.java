package g0201_0300.s0284_peeking_iterator;

// #Medium #Array #Design #Iterator #2022_03_14_Time_5_ms_(78.72%)_Space_43.3_MB_(11.23%)

import java.util.Iterator;

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
