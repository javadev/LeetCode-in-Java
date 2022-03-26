package g1401_1500.s1413_minimum_value_to_get_positive_step_by_step_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minStartValue() {
        assertThat(new Solution().minStartValue(new int[] {-3, 2, -3, 4, 2}), equalTo(5));
    }

    @Test
    void minStartValue2() {
        assertThat(new Solution().minStartValue(new int[] {1, 2}), equalTo(1));
    }

    @Test
    void minStartValue3() {
        assertThat(new Solution().minStartValue(new int[] {1, -2, -3}), equalTo(5));
    }
}
