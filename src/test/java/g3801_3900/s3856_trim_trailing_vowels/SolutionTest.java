package g3801_3900.s3856_trim_trailing_vowels;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void trimTrailingVowels() {
        assertThat(new Solution().trimTrailingVowels("idea"), equalTo("id"));
    }

    @Test
    void trimTrailingVowels2() {
        assertThat(new Solution().trimTrailingVowels("day"), equalTo("day"));
    }

    @Test
    void trimTrailingVowels3() {
        assertThat(new Solution().trimTrailingVowels("aeiou"), equalTo(""));
    }
}
