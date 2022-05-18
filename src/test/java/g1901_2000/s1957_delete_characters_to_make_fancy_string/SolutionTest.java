package g1901_2000.s1957_delete_characters_to_make_fancy_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeFancyString() {
        assertThat(new Solution().makeFancyString("leeetcode"), equalTo("leetcode"));
    }

    @Test
    void makeFancyString2() {
        assertThat(new Solution().makeFancyString("aaabaaaa"), equalTo("aabaa"));
    }

    @Test
    void makeFancyString3() {
        assertThat(new Solution().makeFancyString("aab"), equalTo("aab"));
    }
}
