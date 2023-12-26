package g2901_3000.s2947_count_beautiful_substrings_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void beautifulSubstrings() {
        assertThat(new Solution().beautifulSubstrings("baeyh", 2), equalTo(2));
    }

    @Test
    void beautifulSubstrings2() {
        assertThat(new Solution().beautifulSubstrings("abba", 1), equalTo(3));
    }

    @Test
    void beautifulSubstrings3() {
        assertThat(new Solution().beautifulSubstrings("bcdf", 1), equalTo(0));
    }
}
