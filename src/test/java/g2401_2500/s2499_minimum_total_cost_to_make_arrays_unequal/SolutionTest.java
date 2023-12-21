package g2401_2500.s2499_minimum_total_cost_to_make_arrays_unequal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTotalCost() {
        assertThat(
                new Solution()
                        .minimumTotalCost(new int[] {1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 5}),
                equalTo(10L));
    }

    @Test
    void minimumTotalCost2() {
        assertThat(
                new Solution()
                        .minimumTotalCost(new int[] {2, 2, 2, 1, 3}, new int[] {1, 2, 2, 3, 3}),
                equalTo(10L));
    }

    @Test
    void minimumTotalCost3() {
        assertThat(
                new Solution().minimumTotalCost(new int[] {1, 2, 2}, new int[] {1, 2, 2}),
                equalTo(-1L));
    }
}
