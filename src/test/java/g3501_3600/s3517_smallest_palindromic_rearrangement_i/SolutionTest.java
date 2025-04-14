package g3501_3600.s3517_smallest_palindromic_rearrangement_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestPalindrome() {
        assertThat(new Solution().smallestPalindrome("z"), equalTo("z"));
    }

    @Test
    void smallestPalindrome2() {
        assertThat(new Solution().smallestPalindrome("babab"), equalTo("abbba"));
    }

    @Test
    void smallestPalindrome3() {
        assertThat(new Solution().smallestPalindrome("daccad"), equalTo("acddca"));
    }
}
