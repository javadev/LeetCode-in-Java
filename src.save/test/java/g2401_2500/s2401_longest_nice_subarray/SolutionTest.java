package g2401_2500.s2401_longest_nice_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestNiceSubarray() {
        assertThat(new Solution().longestNiceSubarray(new int[] {1, 3, 8, 48, 10}), equalTo(3));
    }

    @Test
    void longestNiceSubarray2() {
        assertThat(new Solution().longestNiceSubarray(new int[] {3, 1, 5, 11, 13}), equalTo(1));
    }
}
