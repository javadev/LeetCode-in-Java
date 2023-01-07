package g1701_1800.s1775_equal_sum_arrays_with_minimum_number_of_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(
                new Solution()
                        .minOperations(new int[] {1, 2, 3, 4, 5, 6}, new int[] {1, 1, 2, 2, 2, 2}),
                equalTo(3));
    }

    @Test
    void minOperations2() {
        assertThat(
                new Solution().minOperations(new int[] {1, 1, 1, 1, 1, 1, 1}, new int[] {6}),
                equalTo(-1));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {6, 6}, new int[] {1}), equalTo(3));
    }
}
