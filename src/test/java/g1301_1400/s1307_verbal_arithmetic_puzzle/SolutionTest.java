package g1301_1400.s1307_verbal_arithmetic_puzzle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isSolvable() {
        assertThat(
                new Solution().isSolvable(new String[] {"SEND", "MORE"}, "MONEY"), equalTo(true));
    }

    @Test
    void isSolvable2() {
        assertThat(
                new Solution().isSolvable(new String[] {"SIX", "SEVEN", "SEVEN"}, "TWENTY"),
                equalTo(true));
    }

    @Test
    void isSolvable3() {
        assertThat(
                new Solution().isSolvable(new String[] {"LEET", "CODE"}, "POINT"), equalTo(false));
    }
}
