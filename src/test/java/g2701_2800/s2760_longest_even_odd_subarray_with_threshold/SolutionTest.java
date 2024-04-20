package g2701_2800.s2760_longest_even_odd_subarray_with_threshold;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestAlternatingSubarray() {
        assertThat(
                new Solution().longestAlternatingSubarray(new int[] {3, 2, 5, 4}, 5), equalTo(3));
    }

    @Test
    void longestAlternatingSubarray2() {
        assertThat(new Solution().longestAlternatingSubarray(new int[] {1, 2}, 2), equalTo(1));
    }

    @Test
    void longestAlternatingSubarray3() {
        assertThat(
                new Solution().longestAlternatingSubarray(new int[] {2, 3, 4, 5}, 4), equalTo(3));
    }
}
