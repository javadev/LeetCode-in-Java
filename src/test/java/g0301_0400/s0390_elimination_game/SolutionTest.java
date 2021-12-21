package g0301_0400.s0390_elimination_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lastRemaining() {
        assertThat(new Solution().lastRemaining(9), equalTo(6));
    }

    @Test
    void lastRemaining2() {
        assertThat(new Solution().lastRemaining(1), equalTo(1));
    }
}
