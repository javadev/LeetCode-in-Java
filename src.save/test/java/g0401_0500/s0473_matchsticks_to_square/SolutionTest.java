package g0401_0500.s0473_matchsticks_to_square;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeSquare() {
        assertThat(new Solution().makesquare(new int[] {1, 1, 2, 2, 2}), equalTo(true));
    }

    @Test
    void makeSquare2() {
        assertThat(new Solution().makesquare(new int[] {3, 3, 3, 3, 4}), equalTo(false));
    }
}
