package g2801_2900.s2841_maximum_sum_of_almost_unique_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(new Solution().maxSum(Arrays.asList(2, 6, 7, 3, 1, 7), 3, 4), equalTo(18L));
    }

    @Test
    void maxSum2() {
        assertThat(new Solution().maxSum(Arrays.asList(5, 9, 9, 2, 4, 5, 4), 1, 3), equalTo(23L));
    }

    @Test
    void maxSum3() {
        assertThat(new Solution().maxSum(Arrays.asList(1, 2, 1, 2, 1, 2, 1), 3, 3), equalTo(0L));
    }
}
