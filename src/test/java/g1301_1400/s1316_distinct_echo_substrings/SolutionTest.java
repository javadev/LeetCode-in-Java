package g1301_1400.s1316_distinct_echo_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinctEchoSubstrings() {
        assertThat(new Solution().distinctEchoSubstrings("abcabcabc"), equalTo(3));
    }

    @Test
    void distinctEchoSubstrings2() {
        assertThat(new Solution().distinctEchoSubstrings("leetcodeleetcode"), equalTo(2));
    }
}
