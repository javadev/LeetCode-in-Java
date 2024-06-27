package g3101_3200.s3196_maximize_total_cost_of_alternating_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumTotalCost() {
        assertThat(new Solution().maximumTotalCost(new int[] {1, -2, 3, 4}), equalTo(10L));
    }

    @Test
    void maximumTotalCost2() {
        assertThat(new Solution().maximumTotalCost(new int[] {1, -1, 1, -1}), equalTo(4L));
    }

    @Test
    void maximumTotalCost3() {
        assertThat(new Solution().maximumTotalCost(new int[] {0}), equalTo(0L));
    }

    @Test
    void maximumTotalCost4() {
        assertThat(new Solution().maximumTotalCost(new int[] {1, -1}), equalTo(2L));
    }
}
