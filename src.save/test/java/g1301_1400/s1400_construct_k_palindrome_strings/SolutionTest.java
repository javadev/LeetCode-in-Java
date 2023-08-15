package g1301_1400.s1400_construct_k_palindrome_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canConstruct() {
        assertThat(new Solution().canConstruct("annabelle", 2), equalTo(true));
    }

    @Test
    void canConstruct2() {
        assertThat(new Solution().canConstruct("leetcode", 3), equalTo(false));
    }

    @Test
    void canConstruct3() {
        assertThat(new Solution().canConstruct("true", 4), equalTo(true));
    }
}
