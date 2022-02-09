package g0801_0900.s0862_shortest_subarray_with_sum_at_least_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestSubarray() {
        assertThat(new Solution().shortestSubarray(new int[] {1}, 1), equalTo(1));
    }

    @Test
    void shortestSubarray2() {
        assertThat(new Solution().shortestSubarray(new int[] {1, 2}, 4), equalTo(-1));
    }

    @Test
    void shortestSubarray3() {
        assertThat(new Solution().shortestSubarray(new int[] {2, -1, 2}, 3), equalTo(3));
    }
}
