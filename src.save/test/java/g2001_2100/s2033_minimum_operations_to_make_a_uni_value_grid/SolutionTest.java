package g2001_2100.s2033_minimum_operations_to_make_a_uni_value_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[][] {{2, 4}, {6, 8}}, 2), equalTo(4));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[][] {{1, 5}, {2, 3}}, 1), equalTo(5));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[][] {{1, 2}, {3, 4}}, 2), equalTo(-1));
    }
}
