package g0401_0500.s0467_unique_substrings_in_wraparound_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSubstringInWraproundString() {
        assertThat(new Solution().findSubstringInWraproundString("a"), equalTo(1));
    }

    @Test
    void findSubstringInWraproundString2() {
        assertThat(new Solution().findSubstringInWraproundString("cac"), equalTo(2));
    }

    @Test
    void findSubstringInWraproundString3() {
        assertThat(new Solution().findSubstringInWraproundString("zab"), equalTo(6));
    }
}
