package g2901_3000.s2934_minimum_operations_to_maximize_last_elements_in_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(
                new Solution().minOperations(new int[] {1, 2, 7}, new int[] {4, 5, 3}), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(
                new Solution().minOperations(new int[] {2, 3, 4, 5, 9}, new int[] {8, 8, 4, 4, 4}),
                equalTo(2));
    }

    @Test
    void minOperations3() {
        assertThat(
                new Solution().minOperations(new int[] {1, 5, 4}, new int[] {2, 5, 3}),
                equalTo(-1));
    }
}
