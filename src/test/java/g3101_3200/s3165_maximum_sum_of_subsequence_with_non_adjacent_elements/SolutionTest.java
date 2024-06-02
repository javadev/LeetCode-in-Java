package g3101_3200.s3165_maximum_sum_of_subsequence_with_non_adjacent_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSumSubsequence() {
        assertThat(
                new Solution()
                        .maximumSumSubsequence(new int[] {3, 5, 9}, new int[][] {{1, -2}, {0, -3}}),
                equalTo(21));
    }

    @Test
    void maximumSumSubsequence2() {
        assertThat(
                new Solution().maximumSumSubsequence(new int[] {0, -1}, new int[][] {{0, -5}}),
                equalTo(0));
    }
}
