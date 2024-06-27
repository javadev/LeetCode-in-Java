package g3101_3200.s3192_minimum_operations_to_make_binary_array_elements_equal_to_one_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {0, 1, 1, 0, 1}), equalTo(4));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {1, 0, 0, 0}), equalTo(1));
    }
}
