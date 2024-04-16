package g3001_3100.s3076_shortest_uncommon_substring_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestSubstrings() {
        assertThat(
                new Solution().shortestSubstrings(new String[] {"cab", "ad", "bad", "c"}),
                equalTo(new String[] {"ab", "", "ba", ""}));
    }

    @Test
    void shortestSubstrings2() {
        assertThat(
                new Solution().shortestSubstrings(new String[] {"abc", "bcd", "abcd"}),
                equalTo(new String[] {"", "", "abcd"}));
    }
}
