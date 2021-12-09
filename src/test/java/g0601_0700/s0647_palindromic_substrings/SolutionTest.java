package g0601_0700.s0647_palindromic_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubstrings() {
        assertThat(new Solution().countSubstrings("abc"), equalTo(3));
    }

    @Test
    void countSubstrings2() {
        assertThat(new Solution().countSubstrings("aaa"), equalTo(6));
    }
}
