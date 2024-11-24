package g3301_3400.s3360_stone_removal_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canAliceWin() {
        assertThat(new Solution().canAliceWin(12), equalTo(true));
    }

    @Test
    void canAliceWin2() {
        assertThat(new Solution().canAliceWin(1), equalTo(false));
    }

    @Test
    void canAliceWin3() {
        assertThat(new Solution().canAliceWin(19), equalTo(false));
    }
}
