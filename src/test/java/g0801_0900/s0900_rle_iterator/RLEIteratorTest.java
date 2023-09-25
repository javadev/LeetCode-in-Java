package g0801_0900.s0900_rle_iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class RLEIteratorTest {
    @Test
    void rleIteratorTest() {
        RLEIterator rleIterator = new RLEIterator(new int[] {3, 8, 0, 9, 2, 5});
        assertThat(rleIterator.next(2), equalTo(8));
        assertThat(rleIterator.next(1), equalTo(8));
        assertThat(rleIterator.next(1), equalTo(5));
        assertThat(rleIterator.next(2), equalTo(-1));
    }
}
