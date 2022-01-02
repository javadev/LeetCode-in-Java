package g0501_0600.s0507_perfect_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkPerfectNumber() {
        assertThat(new Solution().checkPerfectNumber(28), equalTo(true));
    }

    @Test
    void checkPerfectNumber2() {
        assertThat(new Solution().checkPerfectNumber(7), equalTo(false));
    }
}
