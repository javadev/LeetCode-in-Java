package g2501_2600.s2541_minimum_operations_to_make_array_equal_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(
                new Solution().minOperations(new int[] {4, 3, 1, 4}, new int[] {1, 3, 7, 1}, 3),
                equalTo(2L));
    }

    @Test
    void minOperations2() {
        assertThat(
                new Solution().minOperations(new int[] {3, 8, 5, 2}, new int[] {2, 4, 1, 6}, 1),
                equalTo(-1L));
    }
}
