package g0201_0300.s0292_nim_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canWinNim() {
        assertThat(new Solution().canWinNim(4), equalTo(false));
    }

    @Test
    void canWinNim2() {
        assertThat(new Solution().canWinNim(1), equalTo(true));
    }

    @Test
    void canWinNim3() {
        assertThat(new Solution().canWinNim(2), equalTo(true));
    }
}
