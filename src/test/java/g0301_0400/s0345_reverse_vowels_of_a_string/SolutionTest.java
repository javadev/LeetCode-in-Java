package g0301_0400.s0345_reverse_vowels_of_a_string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void reverseVowels() {
        assertThat(new g0301_0400.s0345_reverse_vowels_of_a_string.Solution().reverseVowels("hello"), equalTo("holle"));
    }

    @Test
    void reverseVowels2() {
        assertThat(new g0301_0400.s0345_reverse_vowels_of_a_string.Solution().reverseVowels("leetcode"), equalTo("leotcede"));
    }
}
