package g3901_4000.s3914_minimum_operations_to_make_array_non_decreasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {3, 3, 2, 1}), equalTo(2L));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {5, 1, 2, 3}), equalTo(4L));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {7}), equalTo(0L));
    }

    @Test
    void minOperations4() {
        assertThat(new Solution().minOperations(new int[] {1, 2, 2, 4}), equalTo(0L));
    }

    @Test
    void minOperations5() {
        assertThat(new Solution().minOperations(new int[] {5, 1, 5, 1}), equalTo(8L));
    }

    @Test
    void minOperations6() {
        assertThat(
                new Solution()
                        .minOperations(new int[] {1000000000, 1, 1000000000, 1, 1000000000, 1}),
                equalTo(2999999997L));
    }
}
