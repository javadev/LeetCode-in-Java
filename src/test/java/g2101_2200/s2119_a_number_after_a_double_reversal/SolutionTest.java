package g2101_2200.s2119_a_number_after_a_double_reversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isSameAfterReversals() {
        assertThat(new Solution().isSameAfterReversals(526), equalTo(true));
    }

    @Test
    void isSameAfterReversals2() {
        assertThat(new Solution().isSameAfterReversals(1800), equalTo(false));
    }

    @Test
    void isSameAfterReversals3() {
        assertThat(new Solution().isSameAfterReversals(0), equalTo(true));
    }
}
