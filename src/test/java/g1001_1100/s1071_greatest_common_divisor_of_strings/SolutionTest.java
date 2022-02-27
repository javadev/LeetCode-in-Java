package g1001_1100.s1071_greatest_common_divisor_of_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void gcdOfStrings() {
        assertThat(new Solution().gcdOfStrings("ABCABC", "ABC"), equalTo("ABC"));
    }

    @Test
    void gcdOfStrings2() {
        assertThat(new Solution().gcdOfStrings("ABABAB", "ABAB"), equalTo("AB"));
    }

    @Test
    void gcdOfStrings3() {
        assertThat(new Solution().gcdOfStrings("LEET", "CODE"), equalTo(""));
    }
}
