package g2301_2400.s2342_max_sum_of_a_pair_with_equal_sum_of_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSum() {
        assertThat(new Solution().maximumSum(new int[] {18, 43, 36, 13, 7}), equalTo(54));
    }

    @Test
    void maximumSum2() {
        assertThat(new Solution().maximumSum(new int[] {10, 12, 19, 14}), equalTo(-1));
    }
}
