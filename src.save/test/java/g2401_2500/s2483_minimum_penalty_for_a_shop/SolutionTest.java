package g2401_2500.s2483_minimum_penalty_for_a_shop;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bestClosingTime() {
        assertThat(new Solution().bestClosingTime("NNNNN"), equalTo(0));
    }

    @Test
    void bestClosingTime2() {
        assertThat(new Solution().bestClosingTime("YYYY"), equalTo(4));
    }
}
