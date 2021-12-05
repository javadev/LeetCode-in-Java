package g0101_0200.s0136_single_number_easy_top_100_liked_questions_top_interview_questions_array_bit_manipulation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void singleNumber() {
        assertThat(new Solution().singleNumber(new int[] {2, 2, 1}), equalTo(1));
    }
}
