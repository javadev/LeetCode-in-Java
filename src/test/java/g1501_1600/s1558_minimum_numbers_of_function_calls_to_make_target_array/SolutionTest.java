package g1501_1600.s1558_minimum_numbers_of_function_calls_to_make_target_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {1, 5}), equalTo(5));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {2, 2}), equalTo(3));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {4, 2, 5}), equalTo(6));
    }
}
