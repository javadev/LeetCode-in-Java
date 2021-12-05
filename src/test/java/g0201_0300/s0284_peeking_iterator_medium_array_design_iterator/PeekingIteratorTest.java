package g0201_0300.s0284_peeking_iterator_medium_array_design_iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class PeekingIteratorTest {
    @Test
    public void peekingIterator() {
        // [1,2,3]
        PeekingIterator peekingIterator = new PeekingIterator(Arrays.asList(1, 2, 3).iterator());
        // return 1, the pointer moves to the next element [1,2,3].
        assertThat(peekingIterator.next(), equalTo(1));
        // return 2, the pointer does not move [1,2,3].
        assertThat(peekingIterator.peek(), equalTo(2));
        // return 2, the pointer moves to the next element [1,2,3]
        assertThat(peekingIterator.next(), equalTo(2));
        // return 3, the pointer moves to the next element [1,2,3]
        assertThat(peekingIterator.next(), equalTo(3));
        // return False
        assertThat(peekingIterator.hasNext(), equalTo(false));
    }
}
