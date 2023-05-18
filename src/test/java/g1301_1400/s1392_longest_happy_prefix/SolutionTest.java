package g1301_1400.s1392_longest_happy_prefix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestPrefix() {
        assertThat(new Solution().longestPrefix("level"), equalTo("l"));
    }

    @Test
    void longestPrefix2() {
        assertThat(new Solution().longestPrefix("ababab"), equalTo("abab"));
    }
}
