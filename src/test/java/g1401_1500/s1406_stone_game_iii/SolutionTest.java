package g1401_1500.s1406_stone_game_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stoneGameIII() {
        assertThat(new Solution().stoneGameIII(new int[] {1, 2, 3, 7}), equalTo("Bob"));
    }

    @Test
    void stoneGameIII2() {
        assertThat(new Solution().stoneGameIII(new int[] {1, 2, 3, -9}), equalTo("Alice"));
    }

    @Test
    void stoneGameIII3() {
        assertThat(new Solution().stoneGameIII(new int[] {1, 2, 3, 6}), equalTo("Tie"));
    }
}
