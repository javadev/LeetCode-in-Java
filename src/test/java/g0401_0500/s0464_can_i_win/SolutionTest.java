package g0401_0500.s0464_can_i_win;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canIWin() {
        assertThat(new Solution().canIWin(10, 0), equalTo(true));
    }

    @Test
    void canIWin2() {
        assertThat(new Solution().canIWin(10, 1), equalTo(true));
    }

    @Test
    void canIWin3() {
        assertThat(new Solution().canIWin(10, 11), equalTo(false));
    }
}
