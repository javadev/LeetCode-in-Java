package g0401_0500.s0403_frog_jump;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canCross() {
        assertThat(new Solution().canCross(new int[] {0, 1, 3, 5, 6, 8, 12, 17}), equalTo(true));
    }

    @Test
    void canCross2() {
        assertThat(new Solution().canCross(new int[] {0, 1, 2, 3, 4, 8, 9, 11}), equalTo(false));
    }
}
