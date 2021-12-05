package g0101_0200.s0128_longest_consecutive_sequence_medium_top_100_liked_questions_top_interview_questions_array_hash_table_union_find;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestConsecutive() {
        assertThat(new Solution().longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}), equalTo(4));
    }
}
