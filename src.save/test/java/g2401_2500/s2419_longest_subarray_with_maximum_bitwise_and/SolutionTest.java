package g2401_2500.s2419_longest_subarray_with_maximum_bitwise_and;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubarray() {
        assertThat(new Solution().longestSubarray(new int[] {1, 2, 3, 3, 2, 2}), equalTo(2));
    }

    @Test
    void longestSubarray2() {
        assertThat(new Solution().longestSubarray(new int[] {1, 2, 3, 4}), equalTo(1));
    }
}
