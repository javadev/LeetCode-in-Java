package g1701_1800.s1749_maximum_absolute_sum_of_any_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAbsoluteSum() {
        assertThat(new Solution().maxAbsoluteSum(new int[] {1, -3, 2, 3, -4}), equalTo(5));
    }

    @Test
    void maxAbsoluteSum2() {
        assertThat(new Solution().maxAbsoluteSum(new int[] {2, -5, 1, -4, 3, -2}), equalTo(8));
    }
}
