package g1001_1100.s1074_number_of_submatrices_that_sum_to_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSubmatrixSumTarget() {
        assertThat(
                new Solution()
                        .numSubmatrixSumTarget(new int[][] {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}}, 0),
                equalTo(4));
    }

    @Test
    void numSubmatrixSumTarget2() {
        assertThat(
                new Solution().numSubmatrixSumTarget(new int[][] {{1, -1}, {-1, 1}}, 0),
                equalTo(5));
    }
}
