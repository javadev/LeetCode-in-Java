package g0501_0600.s0520_detect_capital;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void detectCapitalUse() {
        assertThat(new Solution().detectCapitalUse("USA"), equalTo(true));
    }

    @Test
    void detectCapitalUse2() {
        assertThat(new Solution().detectCapitalUse("FlaG"), equalTo(false));
    }
}
