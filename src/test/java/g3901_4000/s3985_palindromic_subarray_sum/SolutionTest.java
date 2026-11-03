package g3901_4000.s3985_palindromic_subarray_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getSum() {
        assertThat(new Solution().getSum(new int[] {10, 10}), equalTo(20L));
    }

    @Test
    void getSum2() {
        assertThat(new Solution().getSum(new int[] {1, 2, 3, 2, 1, 5, 6}), equalTo(9L));
    }

    @Test
    void getSum3() {
        assertThat(new Solution().getSum(new int[] {7, 1, 2, 1, 7, 3, 4, 3, 4}), equalTo(18L));
    }

    @Test
    void getSum4() {
        assertThat(new Solution().getSum(new int[] {1, 2, 3, 4, 5}), equalTo(5L));
    }

    @Test
    void getSum5() {
        assertThat(new Solution().getSum(new int[] {1000}), equalTo(1000L));
    }
}
