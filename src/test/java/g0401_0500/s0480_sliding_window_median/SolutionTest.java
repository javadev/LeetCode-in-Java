package g0401_0500.s0480_sliding_window_median;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void medianSlidingWindow() {
        assertThat(
                new Solution().medianSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3),
                equalTo(new double[] {1.00000, -1.00000, -1.00000, 3.00000, 5.00000, 6.00000}));
    }

    @Test
    void medianSlidingWindow2() {
        assertThat(
                new Solution().medianSlidingWindow(new int[] {1, 2, 3, 4, 2, 3, 1, 4, 2}, 3),
                equalTo(
                        new double[] {
                            2.00000, 3.00000, 3.00000, 3.00000, 2.00000, 3.00000, 2.00000
                        }));
    }
}
