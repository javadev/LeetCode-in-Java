package g2101_2200.s2110_number_of_smooth_descent_periods_of_a_stock;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getDescentPeriods() {
        assertThat(new Solution().getDescentPeriods(new int[] {3, 2, 1, 4}), equalTo(7L));
    }

    @Test
    void getDescentPeriods2() {
        assertThat(new Solution().getDescentPeriods(new int[] {8, 6, 7, 7}), equalTo(4L));
    }

    @Test
    void getDescentPeriods3() {
        assertThat(new Solution().getDescentPeriods(new int[] {1}), equalTo(1L));
    }
}
