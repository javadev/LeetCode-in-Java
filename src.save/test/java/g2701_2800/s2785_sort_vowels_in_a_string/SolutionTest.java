package g2701_2800.s2785_sort_vowels_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortVowels() {
        assertThat(new Solution().sortVowels("lEetcOde"), equalTo("lEOtcede"));
    }

    @Test
    void sortVowels2() {
        assertThat(new Solution().sortVowels("lYmpH"), equalTo("lYmpH"));
    }
}
