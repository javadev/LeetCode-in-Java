package g3601_3700.s3627_maximum_median_sum_of_subsequences_of_size_3;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumMedianSum() {
        assertThat(new Solution().maximumMedianSum(new int[] {2, 1, 3, 2, 1, 3}), equalTo(5L));
    }

    @Test
    void maximumMedianSum2() {
        assertThat(new Solution().maximumMedianSum(new int[] {1, 1, 10, 10, 10, 10}), equalTo(20L));
    }
}
