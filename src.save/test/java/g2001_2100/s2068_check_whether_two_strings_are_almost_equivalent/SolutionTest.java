package g2001_2100.s2068_check_whether_two_strings_are_almost_equivalent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkAlmostEquivalent() {
        assertThat(new Solution().checkAlmostEquivalent("aaaa", "bccb"), equalTo(false));
    }

    @Test
    void checkAlmostEquivalent2() {
        assertThat(new Solution().checkAlmostEquivalent("abcdeef", "abaaacc"), equalTo(true));
    }

    @Test
    void checkAlmostEquivalent3() {
        assertThat(new Solution().checkAlmostEquivalent("cccddabba", "babababab"), equalTo(true));
    }
}
