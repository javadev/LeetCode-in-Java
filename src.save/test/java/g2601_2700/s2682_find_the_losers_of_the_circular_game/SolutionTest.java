package g2601_2700.s2682_find_the_losers_of_the_circular_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void circularGameLosers() {
        assertThat(new Solution().circularGameLosers(5, 2), equalTo(new int[] {4, 5}));
    }

    @Test
    void circularGameLosers2() {
        assertThat(new Solution().circularGameLosers(4, 4), equalTo(new int[] {2, 3, 4}));
    }
}
