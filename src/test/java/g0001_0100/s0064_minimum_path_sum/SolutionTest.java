package g0001_0100.s0064_minimum_path_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPathSum() {
        int[][] expected = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertThat(new Solution().minPathSum(expected), equalTo(7));
    }
}
