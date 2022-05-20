package g1901_2000.s1961_check_if_string_is_a_prefix_of_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPrefixString() {
        assertThat(
                new Solution()
                        .isPrefixString(
                                "iloveleetcode", new String[] {"i", "love", "leetcode", "apples"}),
                equalTo(true));
    }

    @Test
    void isPrefixString2() {
        assertThat(
                new Solution()
                        .isPrefixString(
                                "iloveleetcode", new String[] {"apples", "i", "love", "leetcode"}),
                equalTo(false));
    }
}
