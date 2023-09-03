package g1701_1800.s1754_largest_merge_of_two_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestMerge() {
        assertThat(new Solution().largestMerge("cabaa", "bcaaa"), equalTo("cbcabaaaaa"));
    }

    @Test
    void largestMerge2() {
        assertThat(new Solution().largestMerge("abcabc", "abdcaba"), equalTo("abdcabcabcaba"));
    }
}
