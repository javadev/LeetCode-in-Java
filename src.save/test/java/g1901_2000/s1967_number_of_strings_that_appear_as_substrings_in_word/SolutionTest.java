package g1901_2000.s1967_number_of_strings_that_appear_as_substrings_in_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfStrings() {
        assertThat(
                new Solution().numOfStrings(new String[] {"a", "abc", "bc", "d"}, "abc"),
                equalTo(3));
    }

    @Test
    void numOfStrings2() {
        assertThat(
                new Solution().numOfStrings(new String[] {"a", "b", "c"}, "aaaaabbbbb"),
                equalTo(2));
    }

    @Test
    void numOfStrings3() {
        assertThat(new Solution().numOfStrings(new String[] {"a", "a", "a"}, "ab"), equalTo(3));
    }
}
