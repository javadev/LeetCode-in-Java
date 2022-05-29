package g2001_2100.s2062_count_vowel_substrings_of_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countVowelSubstrings() {
        assertThat(new Solution().countVowelSubstrings("aeiouu"), equalTo(2));
    }

    @Test
    void countVowelSubstrings2() {
        assertThat(new Solution().countVowelSubstrings("unicornarihan"), equalTo(0));
    }

    @Test
    void countVowelSubstrings3() {
        assertThat(new Solution().countVowelSubstrings("cuaieuouac"), equalTo(7));
    }
}
