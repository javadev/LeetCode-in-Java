package g2601_2700.s2660_determine_the_winner_of_a_bowling_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isWinner() {
        assertThat(
                new Solution().isWinner(new int[] {4, 10, 7, 9}, new int[] {6, 5, 2, 3}),
                equalTo(1));
    }

    @Test
    void isWinner2() {
        assertThat(
                new Solution().isWinner(new int[] {3, 5, 7, 6}, new int[] {8, 10, 10, 2}),
                equalTo(2));
    }

    @Test
    void isWinner3() {
        assertThat(new Solution().isWinner(new int[] {2, 3}, new int[] {4, 1}), equalTo(0));
    }
}
