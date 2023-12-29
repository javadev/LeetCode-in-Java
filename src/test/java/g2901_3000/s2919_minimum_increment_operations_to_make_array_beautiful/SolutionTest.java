package g2901_3000.s2919_minimum_increment_operations_to_make_array_beautiful;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minIncrementOperations() {
        assertThat(
                new Solution().minIncrementOperations(new int[] {2, 3, 0, 0, 2}, 4), equalTo(3L));
    }

    @Test
    void minIncrementOperations2() {
        assertThat(new Solution().minIncrementOperations(new int[] {0, 1, 3, 3}, 5), equalTo(2L));
    }

    @Test
    void minIncrementOperations3() {
        assertThat(new Solution().minIncrementOperations(new int[] {1, 1, 2}, 1), equalTo(0L));
    }
}
