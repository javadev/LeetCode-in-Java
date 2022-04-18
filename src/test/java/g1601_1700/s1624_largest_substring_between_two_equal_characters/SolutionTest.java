package g1601_1700.s1624_largest_substring_between_two_equal_characters;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void maxLengthBetweenEqualCharacters() {
        assertThat(
                new Solution().maxLengthBetweenEqualCharacters("aa"),
                equalTo(0));
    }

    @Test
    void maxLengthBetweenEqualCharacters2() {
        assertThat(
                new Solution().maxLengthBetweenEqualCharacters("abca"),
                equalTo(2));
    }

    @Test
    void maxLengthBetweenEqualCharacters3() {
        assertThat(
                new Solution().maxLengthBetweenEqualCharacters("cbzxy"),
                equalTo(-1));
    }
}
