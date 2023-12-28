package g2901_3000.s2915_length_of_the_longest_subsequence_that_sums_to_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lengthOfLongestSubsequence() {
        assertThat(
                new Solution().lengthOfLongestSubsequence(Arrays.asList(1, 2, 3, 4, 5), 9),
                equalTo(3));
    }

    @Test
    void lengthOfLongestSubsequence2() {
        assertThat(
                new Solution().lengthOfLongestSubsequence(Arrays.asList(4, 1, 3, 2, 1, 5), 7),
                equalTo(4));
    }

    @Test
    void lengthOfLongestSubsequence3() {
        assertThat(
                new Solution().lengthOfLongestSubsequence(Arrays.asList(1, 1, 5, 4, 5), 3),
                equalTo(-1));
    }
}
