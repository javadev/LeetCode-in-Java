package g4001_4100.s4032_longest_subarray_with_at_most_k_distinct_prime_factors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubarray() {
        assertThat(new Solution().longestSubarray(new int[] {2, 3, 4, 5}, 1), equalTo(1));
    }

    @Test
    void longestSubarray2() {
        assertThat(new Solution().longestSubarray(new int[] {2, 4, 8}, 1), equalTo(3));
    }

    @Test
    void longestSubarray3() {
        assertThat(new Solution().longestSubarray(new int[] {2, 3}, 0), equalTo(0));
    }

    @Test
    void longestSubarray4() {
        assertThat(new Solution().longestSubarray(new int[] {1, 1, 2}, 0), equalTo(2));
    }
}
