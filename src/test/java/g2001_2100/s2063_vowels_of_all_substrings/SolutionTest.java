package g2001_2100.s2063_vowels_of_all_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countVowels() {
        assertThat(new Solution().countVowels("aba"), equalTo(6L));
    }

    @Test
    void countVowels2() {
        assertThat(new Solution().countVowels("abc"), equalTo(3L));
    }

    @Test
    void countVowels3() {
        assertThat(new Solution().countVowels("ltcd"), equalTo(0L));
    }
}
