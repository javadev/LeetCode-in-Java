package g2501_2600.s2574_left_and_right_sum_differences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void leftRightDifference() {
        assertThat(
                new Solution().leftRightDifference(new int[] {10, 4, 8, 3}),
                equalTo(new int[] {15, 1, 11, 22}));
    }

    @Test
    void leftRightDifference2() {
        assertThat(new Solution().leftRightDifference(new int[] {1}), equalTo(new int[] {0}));
    }
}
