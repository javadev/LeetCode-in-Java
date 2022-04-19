package g1701_1800.s1800_maximum_ascending_subarray_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAscendingSum() {
        assertThat(new Solution().maxAscendingSum(new int[] {10, 20, 30, 5, 10, 50}), equalTo(65));
    }

    @Test
    void maxAscendingSum2() {
        assertThat(new Solution().maxAscendingSum(new int[] {10, 20, 30, 40, 50}), equalTo(150));
    }

    @Test
    void maxAscendingSum3() {
        assertThat(
                new Solution().maxAscendingSum(new int[] {12, 17, 15, 13, 10, 11, 12}),
                equalTo(33));
    }
}
