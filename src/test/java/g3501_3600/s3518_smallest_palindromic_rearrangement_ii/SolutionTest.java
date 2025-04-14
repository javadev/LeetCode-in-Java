package g3501_3600.s3518_smallest_palindromic_rearrangement_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestPalindrome() {
        assertThat(new Solution().smallestPalindrome("abba", 2), equalTo("baab"));
    }

    @Test
    void smallestPalindrome2() {
        assertThat(new Solution().smallestPalindrome("aa", 2), equalTo(""));
    }

    @Test
    void smallestPalindrome3() {
        assertThat(new Solution().smallestPalindrome("bacab", 1), equalTo("abcba"));
    }
}
