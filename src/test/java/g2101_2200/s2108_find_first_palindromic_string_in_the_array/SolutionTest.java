package g2101_2200.s2108_find_first_palindromic_string_in_the_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstPalindrome() {
        assertThat(
                new Solution()
                        .firstPalindrome(new String[] {"abc", "car", "ada", "racecar", "cool"}),
                equalTo("ada"));
    }

    @Test
    void firstPalindrome2() {
        assertThat(
                new Solution().firstPalindrome(new String[] {"notapalindrome", "racecar"}),
                equalTo("racecar"));
    }

    @Test
    void firstPalindrome3() {
        assertThat(new Solution().firstPalindrome(new String[] {"def", "ghi"}), equalTo(""));
    }
}
