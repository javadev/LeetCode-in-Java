package g3101_3200.s3107_minimum_operations_to_make_median_of_array_equal_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperationsToMakeMedianK() {
        assertThat(
                new Solution().minOperationsToMakeMedianK(new int[] {2, 5, 6, 8, 5}, 4),
                equalTo(2L));
    }

    @Test
    void minOperationsToMakeMedianK2() {
        assertThat(
                new Solution().minOperationsToMakeMedianK(new int[] {2, 5, 6, 8, 5}, 7),
                equalTo(3L));
    }

    @Test
    void minOperationsToMakeMedianK3() {
        assertThat(
                new Solution().minOperationsToMakeMedianK(new int[] {1, 2, 3, 4, 5, 6}, 4),
                equalTo(0L));
    }
}
