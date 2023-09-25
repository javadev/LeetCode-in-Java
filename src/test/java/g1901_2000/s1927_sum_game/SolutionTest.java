package g1901_2000.s1927_sum_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumGame() {
        assertThat(new Solution().sumGame("5023"), equalTo(false));
    }

    @Test
    void sumGame2() {
        assertThat(new Solution().sumGame("25??"), equalTo(true));
    }

    @Test
    void sumGame3() {
        assertThat(new Solution().sumGame("?3295???"), equalTo(false));
    }
}
