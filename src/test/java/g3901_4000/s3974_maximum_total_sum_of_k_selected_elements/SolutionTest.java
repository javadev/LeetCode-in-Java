package g3901_4000.s3974_maximum_total_sum_of_k_selected_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(new Solution().maxSum(new int[] {6, 1, 2, 9}, 3, 2), equalTo(26L));
    }

    @Test
    void maxSum2() {
        assertThat(new Solution().maxSum(new int[] {3, 7, 5, 2}, 2, 4), equalTo(43L));
    }

    @Test
    void maxSum3() {
        assertThat(new Solution().maxSum(new int[] {4, 4}, 1, 1), equalTo(4L));
    }
}
