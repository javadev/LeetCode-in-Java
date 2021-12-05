package g0201_0300.s0300_longest_increasing_subsequence_medium_top_100_liked_questions_top_interview_questions_array_dynamic_programming_binary_search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void lengthOfLIS() {
        assertThat(new Solution().lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}), equalTo(4));
    }

    @Test
    public void lengthOfLIS2() {
        assertThat(new Solution().lengthOfLIS(new int[] {0, 1, 0, 3, 2, 3}), equalTo(4));
    }

    @Test
    public void lengthOfLIS3() {
        assertThat(new Solution().lengthOfLIS(new int[] {7, 7, 7, 7, 7, 7, 7}), equalTo(1));
    }
}
