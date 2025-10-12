package g3701_3800.s3708_longest_fibonacci_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubarray() {
        assertThat(new Solution().longestSubarray(new int[] {1, 1, 1, 1, 2, 3, 5, 1}), equalTo(5));
    }

    @Test
    void longestSubarray2() {
        assertThat(new Solution().longestSubarray(new int[] {5, 2, 7, 9, 16}), equalTo(5));
    }

    @Test
    void longestSubarray3() {
        assertThat(
                new Solution().longestSubarray(new int[] {1000000000, 1000000000, 1000000000}),
                equalTo(2));
    }
}
