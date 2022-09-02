package g2001_2100.s2099_find_subsequence_of_length_k_with_the_largest_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubsequence() {
        assertThat(
                new Solution().maxSubsequence(new int[] {2, 1, 3, 3}, 2),
                equalTo(new int[] {3, 3}));
    }

    @Test
    void maxSubsequence2() {
        assertThat(
                new Solution().maxSubsequence(new int[] {-1, -2, 3, 4}, 3),
                equalTo(new int[] {-1, 3, 4}));
    }

    @Test
    void maxSubsequence3() {
        assertThat(
                new Solution().maxSubsequence(new int[] {3, 4, 3, 3}, 2),
                equalTo(new int[] {4, 3}));
    }
}
