package g0301_0400.s0345_reverse_vowels_of_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseVowels() {
        assertThat(new Solution().reverseVowels("hello"), equalTo("holle"));
    }

    @Test
    void reverseVowels2() {
        assertThat(new Solution().reverseVowels("leetcode"), equalTo("leotcede"));
    }
}
