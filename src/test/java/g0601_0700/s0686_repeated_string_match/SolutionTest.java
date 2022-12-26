package g0601_0700.s0686_repeated_string_match;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void repeatedStringMatch() {
        assertThat(new Solution().repeatedStringMatch("abcd", "cdabcdab"), equalTo(3));
    }

    @Test
    void repeatedStringMatch2() {
        assertThat(new Solution().repeatedStringMatch("a", "aa"), equalTo(2));
    }
}
