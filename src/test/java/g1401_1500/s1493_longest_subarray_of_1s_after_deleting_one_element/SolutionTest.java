package g1401_1500.s1493_longest_subarray_of_1s_after_deleting_one_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubarray() {
        assertThat(new Solution().longestSubarray(new int[] {1, 1, 0, 1}), equalTo(3));
    }

    @Test
    void longestSubarray2() {
        assertThat(
                new Solution().longestSubarray(new int[] {0, 1, 1, 1, 0, 1, 1, 0, 1}), equalTo(5));
    }

    @Test
    void longestSubarray3() {
        assertThat(new Solution().longestSubarray(new int[] {1, 1, 1}), equalTo(2));
    }
}
