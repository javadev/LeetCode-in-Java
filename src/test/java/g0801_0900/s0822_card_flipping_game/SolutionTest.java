package g0801_0900.s0822_card_flipping_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void flipame() {
        assertThat(
                new Solution().flipgame(new int[] {1, 2, 4, 4, 7}, new int[] {1, 3, 4, 1, 3}),
                equalTo(2));
    }

    @Test
    void flipame2() {
        assertThat(new Solution().flipgame(new int[] {1}, new int[] {1}), equalTo(0));
    }
}
