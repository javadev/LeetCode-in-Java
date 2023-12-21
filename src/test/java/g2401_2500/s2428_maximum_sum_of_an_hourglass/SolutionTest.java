package g2401_2500.s2428_maximum_sum_of_an_hourglass;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(
                new Solution()
                        .maxSum(
                                new int[][] {
                                    {6, 2, 1, 3}, {4, 2, 1, 5}, {9, 2, 8, 7}, {4, 1, 2, 9}
                                }),
                equalTo(30));
    }

    @Test
    void maxSum2() {
        assertThat(
                new Solution().maxSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), equalTo(35));
    }
}
