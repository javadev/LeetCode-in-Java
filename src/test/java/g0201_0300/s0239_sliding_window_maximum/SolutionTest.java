package g0201_0300.s0239_sliding_window_maximum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void maxSlidingWindow() {
        assertThat(
                new Solution().maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3),
                equalTo(new int[] {3, 3, 5, 5, 6, 7}));
    }
}
