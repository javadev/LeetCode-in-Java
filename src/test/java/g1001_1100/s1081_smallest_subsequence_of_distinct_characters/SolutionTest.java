package g1001_1100.s1081_smallest_subsequence_of_distinct_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestSubsequence() {
        assertThat(new Solution().smallestSubsequence("bcabc"), equalTo("abc"));
    }

    @Test
    void smallestSubsequence2() {
        assertThat(new Solution().smallestSubsequence("cbacdcbc"), equalTo("acdb"));
    }
}
