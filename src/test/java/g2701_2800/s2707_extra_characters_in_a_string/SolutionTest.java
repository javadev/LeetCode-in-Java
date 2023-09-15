package g2701_2800.s2707_extra_characters_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minExtraChar() {
        assertThat(
                new Solution().minExtraChar("leetscode", new String[] {"leet", "code", "leetcode"}),
                equalTo(1));
    }

    @Test
    void minExtraChar2() {
        assertThat(
                new Solution().minExtraChar("sayhelloworld", new String[] {"hello", "world"}),
                equalTo(3));
    }
}
