package g1701_1800.s1798_maximum_number_of_consecutive_values_you_can_make;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMaximumConsecutive() {
        assertThat(new Solution().getMaximumConsecutive(new int[] {1, 3}), equalTo(2));
    }

    @Test
    void getMaximumConsecutive2() {
        assertThat(new Solution().getMaximumConsecutive(new int[] {1, 1, 1, 4}), equalTo(8));
    }

    @Test
    void getMaximumConsecutive3() {
        assertThat(new Solution().getMaximumConsecutive(new int[] {1, 4, 10, 3, 1}), equalTo(20));
    }
}
