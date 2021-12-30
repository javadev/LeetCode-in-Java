package g0401_0500.s0486_predict_the_winner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void predictTheWinner() {
        assertThat(new Solution().predictTheWinner(new int[] {1, 5, 2}), equalTo(false));
    }

    @Test
    void predictTheWinner2() {
        assertThat(new Solution().predictTheWinner(new int[] {1, 5, 233, 7}), equalTo(true));
    }
}
