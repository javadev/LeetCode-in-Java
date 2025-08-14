package g3601_3700.s3645_maximum_total_from_optimal_activation_order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTotal() {
        assertThat(new Solution().maxTotal(new int[] {3, 5, 8}, new int[] {2, 1, 3}), equalTo(16L));
    }

    @Test
    void maxTotal2() {
        assertThat(new Solution().maxTotal(new int[] {4, 2, 6}, new int[] {1, 1, 1}), equalTo(6L));
    }

    @Test
    void maxTotal3() {
        assertThat(
                new Solution().maxTotal(new int[] {4, 1, 5, 2}, new int[] {3, 3, 2, 3}),
                equalTo(12L));
    }
}
