package g2101_2200.s2124_check_if_all_as_appears_before_all_bs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkString() {
        assertThat(new Solution().checkString("aaabbb"), equalTo(true));
    }

    @Test
    void checkString2() {
        assertThat(new Solution().checkString("abab"), equalTo(false));
    }

    @Test
    void checkString3() {
        assertThat(new Solution().checkString("bbb"), equalTo(true));
    }
}
