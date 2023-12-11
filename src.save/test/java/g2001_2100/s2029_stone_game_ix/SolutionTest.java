package g2001_2100.s2029_stone_game_ix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stoneGameIX() {
        assertThat(new Solution().stoneGameIX(new int[] {2, 1}), equalTo(true));
    }

    @Test
    void stoneGameIX2() {
        assertThat(new Solution().stoneGameIX(new int[] {2}), equalTo(false));
    }

    @Test
    void stoneGameIX3() {
        assertThat(new Solution().stoneGameIX(new int[] {5, 1, 2, 4, 3}), equalTo(false));
    }
}
