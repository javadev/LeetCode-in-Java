package g1801_1900.s1823_find_the_winner_of_the_circular_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTheWinner() {
        assertThat(new Solution().findTheWinner(5, 2), equalTo(3));
    }

    @Test
    void findTheWinner2() {
        assertThat(new Solution().findTheWinner(6, 5), equalTo(1));
    }
}
