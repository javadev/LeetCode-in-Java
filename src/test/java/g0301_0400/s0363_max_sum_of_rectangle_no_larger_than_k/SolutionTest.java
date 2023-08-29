package g0301_0400.s0363_max_sum_of_rectangle_no_larger_than_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumSubmatrix() {
        assertThat(
                new Solution().maxSumSubmatrix(new int[][] {{1, 0, 1}, {0, -2, 3}}, 2), equalTo(2));
    }

    @Test
    void maxSumSubmatrix2() {
        assertThat(new Solution().maxSumSubmatrix(new int[][] {{2, 2, -1}}, 3), equalTo(3));
    }
}
