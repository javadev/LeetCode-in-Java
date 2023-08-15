package g1401_1500.s1480_running_sum_of_1d_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void runningSum() {
        assertThat(
                new Solution().runningSum(new int[] {1, 2, 3, 4}),
                equalTo(new int[] {1, 3, 6, 10}));
    }

    @Test
    void runningSum2() {
        assertThat(
                new Solution().runningSum(new int[] {1, 1, 1, 1, 1}),
                equalTo(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    void runningSum3() {
        assertThat(
                new Solution().runningSum(new int[] {3, 1, 2, 10, 1}),
                equalTo(new int[] {3, 4, 6, 16, 17}));
    }
}
