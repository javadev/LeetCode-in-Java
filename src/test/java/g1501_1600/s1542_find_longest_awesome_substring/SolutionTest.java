package g1501_1600.s1542_find_longest_awesome_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestAwesome() {
        assertThat(new Solution().longestAwesome("3242415"), equalTo(5));
    }

    @Test
    void longestAwesome2() {
        assertThat(new Solution().longestAwesome("12345678"), equalTo(1));
    }

    @Test
    void longestAwesome3() {
        assertThat(new Solution().longestAwesome("213123"), equalTo(6));
    }
}
