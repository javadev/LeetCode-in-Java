package g0001_0100.s0041_first_missing_positive_hard_top_100_liked_questions_top_interview_questions_array_hash_table;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void firstMissingPositive() {
        assertThat(new Solution().firstMissingPositive(new int[] {1, 2, 0}), equalTo(3));
    }

    @Test
    public void firstMissingPositive2() {
        assertThat(new Solution().firstMissingPositive(new int[] {3, 4, -1, 1}), equalTo(2));
    }

    @Test
    public void firstMissingPositive3() {
        assertThat(new Solution().firstMissingPositive(new int[] {7, 8, 9, 11, 12}), equalTo(1));
    }
}
