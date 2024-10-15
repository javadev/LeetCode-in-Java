package g3301_3400.s3318_find_x_sum_of_all_k_long_subarrays_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findXSum() {
        assertThat(
                new Solution().findXSum(new int[] {1, 1, 2, 2, 3, 4, 2, 3}, 6, 2),
                equalTo(new int[] {6, 10, 12}));
    }

    @Test
    void findXSum2() {
        assertThat(
                new Solution().findXSum(new int[] {3, 8, 7, 8, 7, 5}, 2, 2),
                equalTo(new int[] {11, 15, 15, 15, 12}));
    }
}
