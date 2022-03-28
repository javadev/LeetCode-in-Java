package g1401_1500.s1438_longest_continuous_subarray_with_absolute_diff_less_than_or_equal_to_limit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubarray() {
        assertThat(new Solution().longestSubarray(new int[] {8, 2, 4, 7}, 4), equalTo(2));
    }

    @Test
    void longestSubarray2() {
        assertThat(new Solution().longestSubarray(new int[] {10, 1, 2, 4, 7, 2}, 5), equalTo(4));
    }

    @Test
    void longestSubarray3() {
        assertThat(
                new Solution().longestSubarray(new int[] {4, 2, 2, 2, 4, 4, 2, 2}, 0), equalTo(3));
    }
}
