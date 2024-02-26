package g2901_3000.s2949_count_beautiful_substrings_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void beautifulSubstrings() {
        assertThat(new Solution().beautifulSubstrings("baeyh", 2), equalTo(2L));
    }

    @Test
    void beautifulSubstrings2() {
        assertThat(new Solution().beautifulSubstrings("abba", 1), equalTo(3L));
    }

    @Test
    void beautifulSubstrings3() {
        assertThat(new Solution().beautifulSubstrings("bcdf", 1), equalTo(0L));
    }
}
