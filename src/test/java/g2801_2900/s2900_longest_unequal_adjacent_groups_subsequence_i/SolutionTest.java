package g2801_2900.s2900_longest_unequal_adjacent_groups_subsequence_i;

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
                                3, new String[] {"e", "a", "b"}, new int[] {0, 0, 1}),
                equalTo(Arrays.asList("e", "b")));
    }

    @Test
    void getWordsInLongestSubsequence2() {
        assertThat(
                new Solution()
                        .getWordsInLongestSubsequence(
                                4, new String[] {"a", "b", "c", "d"}, new int[] {1, 0, 1, 1}),
                equalTo(Arrays.asList("a", "b", "c")));
    }
}
