package g1801_1900.s1839_longest_substring_of_all_vowels_in_order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestBeautifulSubstring() {
        assertThat(
                new Solution().longestBeautifulSubstring("aeiaaioaaaaeiiiiouuuooaauuaeiu"),
                equalTo(13));
    }

    @Test
    void longestBeautifulSubstring2() {
        assertThat(new Solution().longestBeautifulSubstring("aeeeiiiioooauuuaeiou"), equalTo(5));
    }

    @Test
    void longestBeautifulSubstring3() {
        assertThat(new Solution().longestBeautifulSubstring("a"), equalTo(0));
    }
}
