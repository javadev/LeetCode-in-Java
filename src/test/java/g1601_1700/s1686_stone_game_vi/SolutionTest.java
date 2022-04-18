package g1601_1700.s1686_stone_game_vi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stoneGameVI() {
        assertThat(new Solution().stoneGameVI(new int[] {1, 3}, new int[] {2, 1}), equalTo(1));
    }

    @Test
    void stoneGameVI2() {
        assertThat(new Solution().stoneGameVI(new int[] {1, 2}, new int[] {3, 1}), equalTo(0));
    }

    @Test
    void stoneGameVI3() {
        assertThat(
                new Solution().stoneGameVI(new int[] {2, 4, 3}, new int[] {1, 6, 7}), equalTo(-1));
    }
}
