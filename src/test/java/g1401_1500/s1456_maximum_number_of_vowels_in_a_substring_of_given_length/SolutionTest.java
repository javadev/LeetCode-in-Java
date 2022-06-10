package g1401_1500.s1456_maximum_number_of_vowels_in_a_substring_of_given_length;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxVowels() {
        assertThat(new Solution().maxVowels("abciiidef", 3), equalTo(3));
    }

    @Test
    void maxVowels2() {
        assertThat(new Solution().maxVowels("aeiou", 2), equalTo(2));
    }

    @Test
    void maxVowels3() {
        assertThat(new Solution().maxVowels("leetcode", 3), equalTo(2));
    }
}
