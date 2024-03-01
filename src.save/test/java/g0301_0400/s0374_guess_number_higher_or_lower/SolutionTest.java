package g0301_0400.s0374_guess_number_higher_or_lower;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void guessNumber() {
        assertThat(new Solution().guessNumber(10), equalTo(7));
    }

    @Test
    void guessNumber2() {
        assertThat(new Solution().guessNumber(1), equalTo(-1));
    }

    @Test
    void guessNumber3() {
        assertThat(new Solution().guessNumber(2), equalTo(-1));
    }

    @Test
    void guessNumber4() {
        assertThat(new Solution().guessNumber(6), equalTo(-1));
    }
}
