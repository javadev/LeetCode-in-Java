package g0901_1000.s0953_verifying_an_alien_dictionary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isAlienSorted() {
        assertThat(
                new Solution()
                        .isAlienSorted(
                                new String[] {"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"),
                equalTo(true));
    }

    @Test
    void isAlienSorted2() {
        assertThat(
                new Solution()
                        .isAlienSorted(
                                new String[] {"word", "world", "row"},
                                "worldabcefghijkmnpqstuvxyz"),
                equalTo(false));
    }

    @Test
    void isAlienSorted3() {
        assertThat(
                new Solution()
                        .isAlienSorted(new String[] {"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"),
                equalTo(false));
    }
}
