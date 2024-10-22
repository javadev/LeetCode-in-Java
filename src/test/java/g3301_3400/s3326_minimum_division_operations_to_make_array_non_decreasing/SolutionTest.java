package g3301_3400.s3326_minimum_division_operations_to_make_array_non_decreasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {25, 7}), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {7, 7, 6}), equalTo(-1));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {1, 1, 1, 1}), equalTo(0));
    }
}
