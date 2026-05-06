package g3701_3800.s3780_maximum_sum_of_three_numbers_divisible_by_three;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSum() {
        assertThat(new Solution().maximumSum(new int[] {4, 2, 3, 1}), equalTo(9));
    }

    @Test
    void maximumSum2() {
        assertThat(new Solution().maximumSum(new int[] {2, 1, 5}), equalTo(0));
    }
}
