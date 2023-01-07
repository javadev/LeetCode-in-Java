package g2301_2400.s2370_longest_ideal_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestIdealString() {
        assertThat(new Solution().longestIdealString("acfgbd", 2), equalTo(4));
    }

    @Test
    void longestIdealString2() {
        assertThat(new Solution().longestIdealString("abcd", 3), equalTo(4));
    }
}
