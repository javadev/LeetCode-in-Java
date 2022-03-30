package g1301_1400.s1371_find_the_longest_substring_containing_vowels_in_even_counts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTheLongestSubstring() {
        assertThat(new Solution().findTheLongestSubstring("eleetminicoworoep"), equalTo(13));
    }

    @Test
    void findTheLongestSubstring2() {
        assertThat(new Solution().findTheLongestSubstring("leetcodeisgreat"), equalTo(5));
    }

    @Test
    void findTheLongestSubstring3() {
        assertThat(new Solution().findTheLongestSubstring("bcbcbc"), equalTo(6));
    }
}
