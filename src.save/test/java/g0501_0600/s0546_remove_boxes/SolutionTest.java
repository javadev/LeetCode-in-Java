package g0501_0600.s0546_remove_boxes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeBoxes() {
        assertThat(new Solution().removeBoxes(new int[] {1, 3, 2, 2, 2, 3, 4, 3, 1}), equalTo(23));
    }

    @Test
    void removeBoxes2() {
        assertThat(new Solution().removeBoxes(new int[] {1, 1, 1}), equalTo(9));
    }

    @Test
    void removeBoxes3() {
        assertThat(new Solution().removeBoxes(new int[] {1}), equalTo(1));
    }
}
