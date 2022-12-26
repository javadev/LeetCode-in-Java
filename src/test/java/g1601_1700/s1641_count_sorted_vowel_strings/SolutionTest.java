package g1601_1700.s1641_count_sorted_vowel_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countVowelStrings() {
        assertThat(new Solution().countVowelStrings(1), equalTo(5));
    }

    @Test
    void countVowelStrings2() {
        assertThat(new Solution().countVowelStrings(2), equalTo(15));
    }
}
