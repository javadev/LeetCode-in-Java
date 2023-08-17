package g1501_1600.s1589_maximum_sum_obtained_of_any_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumRangeQuery() {
        assertThat(
                new Solution()
                        .maxSumRangeQuery(new int[] {1, 2, 3, 4, 5}, new int[][] {{1, 3}, {0, 1}}),
                equalTo(19));
    }

    @Test
    void maxSumRangeQuery2() {
        assertThat(
                new Solution().maxSumRangeQuery(new int[] {1, 2, 3, 4, 5, 6}, new int[][] {{0, 1}}),
                equalTo(11));
    }
}
