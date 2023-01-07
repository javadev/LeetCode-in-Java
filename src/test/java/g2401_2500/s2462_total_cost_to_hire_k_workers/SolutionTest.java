package g2401_2500.s2462_total_cost_to_hire_k_workers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalCost() {
        assertThat(
                new Solution().totalCost(new int[] {17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4),
                equalTo(11L));
    }

    @Test
    void totalCost2() {
        assertThat(new Solution().totalCost(new int[] {1, 2, 4, 1}, 3, 3), equalTo(4L));
    }
}
