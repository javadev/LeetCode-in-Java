package g1501_1600.s1535_find_the_winner_of_an_array_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getWinner() {
        assertThat(new Solution().getWinner(new int[] {2, 1, 3, 5, 4, 6, 7}, 2), equalTo(5));
    }

    @Test
    void getWinner2() {
        assertThat(new Solution().getWinner(new int[] {3, 2, 1}, 10), equalTo(3));
    }
}
