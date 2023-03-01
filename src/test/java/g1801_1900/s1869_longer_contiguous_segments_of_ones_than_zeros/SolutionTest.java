package g1801_1900.s1869_longer_contiguous_segments_of_ones_than_zeros;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkZeroOnes() {
        assertThat(new Solution().checkZeroOnes("1101"), equalTo(true));
    }

    @Test
    void checkZeroOnes2() {
        assertThat(new Solution().checkZeroOnes("111000"), equalTo(false));
    }

    @Test
    void checkZeroOnes3() {
        assertThat(new Solution().checkZeroOnes("110100010"), equalTo(false));
    }
}
