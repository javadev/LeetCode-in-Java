package g3501_3600.s3542_minimum_operations_to_convert_all_elements_to_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {0, 2}), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {3, 1, 2, 1}), equalTo(3));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {1, 2, 1, 2, 1, 2}), equalTo(4));
    }
}
