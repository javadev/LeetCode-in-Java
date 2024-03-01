package g1601_1700.s1657_determine_if_two_strings_are_close;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void closeStrings() {
        assertThat(new Solution().closeStrings("abc", "bca"), equalTo(true));
    }

    @Test
    void closeStrings2() {
        assertThat(new Solution().closeStrings("a", "aa"), equalTo(false));
    }

    @Test
    void closeStrings3() {
        assertThat(new Solution().closeStrings("cabbba", "abbccc"), equalTo(true));
    }

    @Test
    void closeStrings4() {
        assertThat(new Solution().closeStrings("aa", "aa"), equalTo(true));
    }

    @Test
    void closeStrings5() {
        assertThat(new Solution().closeStrings("a", "b"), equalTo(false));
    }
}
