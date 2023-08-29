package g1601_1700.s1690_stone_game_vii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stoneGameVII() {
        assertThat(new Solution().stoneGameVII(new int[] {5, 3, 1, 4, 2}), equalTo(6));
    }

    @Test
    void stoneGameVII2() {
        assertThat(
                new Solution().stoneGameVII(new int[] {7, 90, 5, 1, 100, 10, 10, 2}), equalTo(122));
    }
}
