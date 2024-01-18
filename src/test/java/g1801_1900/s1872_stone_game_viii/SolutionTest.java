package g1801_1900.s1872_stone_game_viii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stoneGameVIII() {
        assertThat(new Solution().stoneGameVIII(new int[] {-1, 2, -3, 4, -5}), equalTo(5));
    }

    @Test
    void stoneGameVIII2() {
        assertThat(new Solution().stoneGameVIII(new int[] {7, -6, 5, 10, 5, -2, -6}), equalTo(13));
    }

    @Test
    void stoneGameVIII3() {
        assertThat(new Solution().stoneGameVIII(new int[] {-10, -12}), equalTo(-22));
    }
}
