package g1401_1500.s1405_longest_happy_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestDiverseString() {
        assertThat(new Solution().longestDiverseString(1, 1, 7), equalTo("ccbccacc"));
    }

    @Test
    void longestDiverseString2() {
        assertThat(new Solution().longestDiverseString(7, 1, 0), equalTo("aabaa"));
    }
}
