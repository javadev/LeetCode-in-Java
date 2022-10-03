package g1501_1600.s1563_stone_game_v;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stoneGameV() {
        assertThat(new Solution().stoneGameV(new int[] {6, 2, 3, 4, 5, 5}), equalTo(18));
    }

    @Test
    void stoneGameV2() {
        assertThat(new Solution().stoneGameV(new int[] {7, 7, 7, 7, 7, 7, 7}), equalTo(28));
    }

    @Test
    void stoneGameV3() {
        assertThat(new Solution().stoneGameV(new int[] {4}), equalTo(0));
    }
}
