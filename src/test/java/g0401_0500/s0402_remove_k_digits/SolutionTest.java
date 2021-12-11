package g0401_0500.s0402_remove_k_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeKdigits() {
        assertThat(new Solution().removeKdigits("1432219", 3), equalTo("1219"));
    }

    @Test
    void removeKdigits2() {
        assertThat(new Solution().removeKdigits("10200", 1), equalTo("200"));
    }

    @Test
    void removeKdigits3() {
        assertThat(new Solution().removeKdigits("10", 2), equalTo("0"));
    }
}
