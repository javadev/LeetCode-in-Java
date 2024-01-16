package g1001_1100.s1005_maximize_sum_of_array_after_k_negations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestSumAfterKNegations() {
        assertThat(new Solution().largestSumAfterKNegations(new int[] {4, 2, 3}, 1), equalTo(5));
    }

    @Test
    void largestSumAfterKNegations2() {
        assertThat(
                new Solution().largestSumAfterKNegations(new int[] {3, -1, 0, 2}, 3), equalTo(6));
    }

    @Test
    void largestSumAfterKNegations3() {
        assertThat(
                new Solution().largestSumAfterKNegations(new int[] {2, -3, -1, 5, -4}, 2),
                equalTo(13));
    }
}
