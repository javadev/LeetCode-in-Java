package g2701_2800.s2800_shortest_string_that_contains_three_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumString() {
        assertThat(new Solution().minimumString("abc", "bca", "aaa"), equalTo("aaabca"));
    }

    @Test
    void minimumString2() {
        assertThat(new Solution().minimumString("ab", "ba", "aba"), equalTo("aba"));
    }
}
