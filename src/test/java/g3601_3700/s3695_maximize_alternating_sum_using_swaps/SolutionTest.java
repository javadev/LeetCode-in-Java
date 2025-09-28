package g3601_3700.s3695_maximize_alternating_sum_using_swaps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAlternatingSum() {
        assertThat(
                new Solution().maxAlternatingSum(new int[] {1, 2, 3}, new int[][] {{0, 2}, {1, 2}}),
                equalTo(4L));
    }

    @Test
    void maxAlternatingSum2() {
        assertThat(
                new Solution().maxAlternatingSum(new int[] {1, 2, 3}, new int[][] {{1, 2}}),
                equalTo(2L));
    }

    @Test
    void maxAlternatingSum3() {
        assertThat(
                new Solution()
                        .maxAlternatingSum(
                                new int[] {1, 1000000000, 1, 1000000000, 1, 1000000000},
                                new int[][] {}),
                equalTo(-2999999997L));
    }
}
