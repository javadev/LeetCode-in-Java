package g0501_0600.s0593_valid_square;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validSquare() {
        int[] p1 = {0, 0};
        int[] p2 = {1, 1};
        int[] p3 = {1, 0};
        int[] p4 = {0, 1};
        assertThat(new Solution().validSquare(p1, p2, p3, p4), equalTo(true));
    }

    @Test
    void validSquare2() {
        int[] p1 = {1, 1};
        int[] p2 = {5, 3};
        int[] p3 = {3, 5};
        int[] p4 = {7, 7};
        assertThat(new Solution().validSquare(p1, p2, p3, p4), equalTo(false));
    }
}
