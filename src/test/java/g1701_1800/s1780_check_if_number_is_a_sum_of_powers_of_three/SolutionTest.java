package g1701_1800.s1780_check_if_number_is_a_sum_of_powers_of_three;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkPowersOfThree() {
        assertThat(new Solution().checkPowersOfThree(12), equalTo(true));
    }

    @Test
    void checkPowersOfThree2() {
        assertThat(new Solution().checkPowersOfThree(91), equalTo(true));
    }

    @Test
    void checkPowersOfThree3() {
        assertThat(new Solution().checkPowersOfThree(21), equalTo(false));
    }
}
