package g2901_3000.s2901_longest_unequal_adjacent_groups_subsequence_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getWordsInLongestSubsequence() {
        assertThat(
                new Solution()
                        .getWordsInLongestSubsequence(
                                3, new String[] {"bab", "dab", "cab"}, new int[] {1, 2, 2}),
                equalTo(Arrays.asList("bab", "dab")));
    }

    @Test
    void getWordsInLongestSubsequence2() {
        assertThat(
                new Solution()
                        .getWordsInLongestSubsequence(
                                4, new String[] {"a", "b", "c", "d"}, new int[] {1, 2, 3, 4}),
                equalTo(Arrays.asList("a", "b", "c", "d")));
    }
}
