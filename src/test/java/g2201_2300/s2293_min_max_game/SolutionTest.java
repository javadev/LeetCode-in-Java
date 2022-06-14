package g2201_2300.s2293_min_max_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMaxGame() {
        assertThat(new Solution().minMaxGame(new int[] {1, 3, 5, 2, 4, 8, 2, 2}), equalTo(1));
    }

    @Test
    void minMaxGame2() {
        assertThat(new Solution().minMaxGame(new int[] {3}), equalTo(3));
    }
}
