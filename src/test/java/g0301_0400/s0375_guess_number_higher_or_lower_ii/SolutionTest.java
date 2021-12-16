package g0301_0400.s0375_guess_number_higher_or_lower_ii;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void getMoneyAmount() {
        assertThat(
                new Solution().getMoneyAmount(10),
                equalTo(16));
    }

    @Test
    void getMoneyAmount2() {
        assertThat(
                new Solution().getMoneyAmount(1),
                equalTo(0));
    }

    @Test
    void getMoneyAmount3() {
        assertThat(
                new Solution().getMoneyAmount(2),
                equalTo(1));
    }
}
