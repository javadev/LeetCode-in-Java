package g0101_0200.s0152_maximum_product_subarray_medium_top_100_liked_questions_top_interview_questions_array_dynamic_programming;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxProduct() {
        assertThat(new Solution().maxProduct(new int[] {2, 3, -2, 4}), equalTo(6));
    }
}
