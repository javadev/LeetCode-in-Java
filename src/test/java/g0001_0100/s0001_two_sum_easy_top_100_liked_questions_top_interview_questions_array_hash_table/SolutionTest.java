package g0001_0100.s0001_two_sum_easy_top_100_liked_questions_top_interview_questions_array_hash_table;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void twoSum() {
        assertThat(new Solution().twoSum(new int[] {2, 7, 11, 15}, 9), equalTo(new int[] {0, 1}));
    }
}
