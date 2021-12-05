package g0201_0300.s0238_product_of_array_except_self_medium_top_100_liked_questions_top_interview_questions_array_prefix_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void productExceptSelf() {
        assertThat(
                new Solution().productExceptSelf(new int[] {1, 2, 3, 4}),
                equalTo(new int[] {24, 12, 8, 6}));
    }

    @Test
    public void productExceptSelf2() {
        assertThat(
                new Solution().productExceptSelf(new int[] {-1, 1, 0, -3, 3}),
                equalTo(new int[] {0, 0, 9, 0, 0}));
    }
}
