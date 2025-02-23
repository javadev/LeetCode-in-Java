package g3401_3500.s3462_maximum_sum_with_at_most_k_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(
                new Solution().maxSum(new int[][] {{1, 2}, {3, 4}}, new int[] {1, 2}, 2),
                equalTo(7L));
    }

    @Test
    void maxSum2() {
        assertThat(
                new Solution().maxSum(new int[][] {{5, 3, 7}, {8, 2, 6}}, new int[] {2, 2}, 3),
                equalTo(21L));
    }

    @Test
    void maxSum3() {
        assertThat(
                new Solution().maxSum(new int[][] {{}}, new int[] {2, 2}, 3),
                equalTo(0L));
    }
}
