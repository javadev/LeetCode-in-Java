package g3801_3900.s3810_minimum_operations_to_reach_target_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(
                new Solution().minOperations(new int[] {1, 2, 3}, new int[] {2, 1, 3}), equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(
                new Solution().minOperations(new int[] {4, 1, 4}, new int[] {5, 1, 4}), equalTo(1));
    }

    @Test
    void minOperations3() {
        assertThat(
                new Solution().minOperations(new int[] {7, 3, 7}, new int[] {5, 5, 9}), equalTo(2));
    }
}
