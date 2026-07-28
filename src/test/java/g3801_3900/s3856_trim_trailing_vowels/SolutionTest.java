package g3801_3900.s3856_trim_trailing_vowels;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removesOnlyTrailingVowels() {
        Solution solution = new Solution();

        assertThat(solution.trimTrailingVowels("idea"), equalTo("id"));
        assertThat(solution.trimTrailingVowels("day"), equalTo("day"));
        assertThat(solution.trimTrailingVowels("aeiou"), equalTo(""));
    }
}
