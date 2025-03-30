package g3501_3600.s3505_minimum_operations_to_make_elements_within_k_subarrays_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(
                new Solution().minOperations(new int[] {5, -2, 1, 3, 7, 3, 6, 4, -1}, 3, 2),
                equalTo(8L));
    }

    @Test
    void minOperations2() {
        assertThat(
                new Solution().minOperations(new int[] {9, -2, -2, -2, 1, 5}, 2, 2), equalTo(3L));
    }
}
