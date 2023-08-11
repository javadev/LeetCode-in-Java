package g0401_0500.s0436_find_right_interval;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findRightInterval() {
        assertThat(new Solution().findRightInterval(new int[][] {{1, 2}}), equalTo(new int[] {-1}));
    }

    @Test
    void findRightInterval2() {
        assertThat(
                new Solution().findRightInterval(new int[][] {{3, 4}, {2, 3}, {1, 2}}),
                equalTo(new int[] {-1, 0, 1}));
    }
}
