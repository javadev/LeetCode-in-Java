package g3401_3500.s3409_longest_subsequence_with_decreasing_adjacent_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubsequence() {
        assertThat(new Solution().longestSubsequence(new int[] {16, 6, 3}), equalTo(3));
    }

    @Test
    void longestSubsequence2() {
        assertThat(new Solution().longestSubsequence(new int[] {6, 5, 3, 4, 2, 1}), equalTo(4));
    }

    @Test
    void longestSubsequence3() {
        assertThat(
                new Solution().longestSubsequence(new int[] {10, 20, 10, 19, 10, 20}), equalTo(5));
    }
}
