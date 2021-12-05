package g0201_0300.s0268_missing_number_easy_top_interview_questions_array_hash_table_math_sorting_bit_manipulation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void missingNumber() {
        assertThat(new Solution().missingNumber(new int[] {3, 0, 1}), equalTo(2));
    }

    @Test
    public void missingNumber2() {
        assertThat(new Solution().missingNumber(new int[] {3, 0, 1}), equalTo(2));
    }

    @Test
    public void missingNumber3() {
        assertThat(new Solution().missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}), equalTo(8));
    }

    @Test
    public void missingNumber4() {
        assertThat(new Solution().missingNumber(new int[] {0}), equalTo(1));
    }
}
