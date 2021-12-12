package g0301_0400.s0343_integer_break;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void integerBreak() {
        assertThat(new Solution().integerBreak(2), equalTo(1));
    }

    @Test
    void integerBreak2() {
        assertThat(new Solution().integerBreak(10), equalTo(36));
    }
}
