package g0801_0900.s0813_largest_sum_of_averages;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestSumOfAverages() {
        assertThat(
                new Solution().largestSumOfAverages(new int[] {9, 1, 2, 3, 9}, 3), equalTo(20.0));
    }

    @Test
    void largestSumOfAverages2() {
        assertThat(
                new Solution().largestSumOfAverages(new int[] {1, 2, 3, 4, 5, 6, 7}, 4),
                equalTo(20.5));
    }
}
