package g2901_3000.s2974_minimum_number_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberGame() {
        assertThat(
                new Solution().numberGame(new int[] {5, 4, 2, 3}), equalTo(new int[] {3, 2, 5, 4}));
    }

    @Test
    void numberGame2() {
        assertThat(new Solution().numberGame(new int[] {2, 5}), equalTo(new int[] {5, 2}));
    }
}
