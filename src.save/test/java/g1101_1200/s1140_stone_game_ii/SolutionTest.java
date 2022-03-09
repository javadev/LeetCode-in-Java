package g1101_1200.s1140_stone_game_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stoneGameII() {
        assertThat(new Solution().stoneGameII(new int[] {2, 7, 9, 4, 4}), equalTo(10));
    }

    @Test
    void stoneGameII2() {
        assertThat(new Solution().stoneGameII(new int[] {1, 2, 3, 4, 5, 100}), equalTo(104));
    }
}
