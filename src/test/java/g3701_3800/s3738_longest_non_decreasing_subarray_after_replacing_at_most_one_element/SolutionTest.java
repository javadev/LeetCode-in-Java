package g3701_3800.s3738_longest_non_decreasing_subarray_after_replacing_at_most_one_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubarray() {
        assertThat(new Solution().longestSubarray(new int[] {1, 2, 3}), equalTo(3));
    }

    @Test
    void longestSubarray2() {
        assertThat(new Solution().longestSubarray(new int[] {3, 2, 1}), equalTo(2));
    }

    @Test
    void longestSubarray3() {
        assertThat(new Solution().longestSubarray(new int[] {1, 5, 3, 4, 6}), equalTo(5));
    }
}
