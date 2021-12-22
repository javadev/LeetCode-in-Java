package g0301_0400.s0397_integer_replacement;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void integerReplacement() {
        assertThat(new Solution().integerReplacement(8), equalTo(3));
    }

    @Test
    void integerReplacement2() {
        assertThat(new Solution().integerReplacement(7), equalTo(4));
    }

    @Test
    void integerReplacement3() {
        assertThat(new Solution().integerReplacement(4), equalTo(2));
    }
}
