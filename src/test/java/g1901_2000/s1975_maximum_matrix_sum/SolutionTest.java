package g1901_2000.s1975_maximum_matrix_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxMatrixSum() {
        assertThat(new Solution().maxMatrixSum(new int[][] {{1, -1}, {-1, 1}}), equalTo(4L));
    }

    @Test
    void maxMatrixSum2() {
        assertThat(
                new Solution().maxMatrixSum(new int[][] {{1, 2, 3}, {-1, -2, -3}, {1, 2, 3}}),
                equalTo(16L));
    }
}
