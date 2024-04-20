package g2801_2900.s2815_max_pair_sum_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(new Solution().maxSum(new int[] {51, 71, 17, 24, 42}), equalTo(88));
    }

    @Test
    void maxSum2() {
        assertThat(new Solution().maxSum(new int[] {1, 2, 3, 4}), equalTo(-1));
    }
}
