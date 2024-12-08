package g3301_3400.s3375_minimum_operations_to_make_array_values_equal_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {5, 2, 5, 4, 5}, 2), equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {2, 1, 2}, 2), equalTo(-1));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {9, 7, 5, 3}, 1), equalTo(4));
    }
}
