package g1201_1300.s1218_longest_arithmetic_subsequence_of_given_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubsequence() {
        assertThat(new Solution().longestSubsequence(new int[] {1, 2, 3, 4}, 1), equalTo(4));
    }

    @Test
    void longestSubsequence2() {
        assertThat(new Solution().longestSubsequence(new int[] {1, 3, 5, 7}, 1), equalTo(1));
    }

    @Test
    void longestSubsequence3() {
        assertThat(
                new Solution().longestSubsequence(new int[] {1, 5, 7, 8, 5, 3, 4, 2, 1}, -2),
                equalTo(4));
    }
}
