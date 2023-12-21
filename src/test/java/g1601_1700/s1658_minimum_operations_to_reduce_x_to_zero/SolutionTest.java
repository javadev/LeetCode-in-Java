package g1601_1700.s1658_minimum_operations_to_reduce_x_to_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {1, 1, 4, 2, 3}, 5), equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {5, 6, 7, 8, 9}, 4), equalTo(-1));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {3, 2, 20, 1, 1, 3}, 10), equalTo(5));
    }
}
