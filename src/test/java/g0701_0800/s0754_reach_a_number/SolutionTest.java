package g0701_0800.s0754_reach_a_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reachNumber() {
        assertThat(new Solution().reachNumber(2), equalTo(3));
    }

    @Test
    void reachNumber2() {
        assertThat(new Solution().reachNumber(3), equalTo(2));
    }
}
