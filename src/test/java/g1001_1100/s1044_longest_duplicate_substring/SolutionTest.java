package g1001_1100.s1044_longest_duplicate_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestDupSubstring() {
        assertThat(new Solution().longestDupSubstring("banana"), equalTo("ana"));
    }

    @Test
    void longestDupSubstring2() {
        assertThat(new Solution().longestDupSubstring("abcd"), equalTo(""));
    }
}
