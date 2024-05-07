package g3101_3200.s3139_minimum_cost_to_equalize_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCostToEqualizeArray() {
        assertThat(new Solution().minCostToEqualizeArray(new int[] {4, 1}, 5, 2), equalTo(15));
    }

    @Test
    void minCostToEqualizeArray2() {
        assertThat(
                new Solution().minCostToEqualizeArray(new int[] {2, 3, 3, 3, 5}, 2, 1), equalTo(6));
    }

    @Test
    void minCostToEqualizeArray3() {
        assertThat(new Solution().minCostToEqualizeArray(new int[] {3, 5, 3}, 1, 3), equalTo(4));
    }
}
