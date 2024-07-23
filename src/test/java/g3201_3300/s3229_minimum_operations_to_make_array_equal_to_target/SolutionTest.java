package g3201_3300.s3229_minimum_operations_to_make_array_equal_to_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(
                new Solution().minimumOperations(new int[] {3, 5, 1, 2}, new int[] {4, 6, 2, 4}),
                equalTo(2L));
    }

    @Test
    void minimumOperations2() {
        assertThat(
                new Solution().minimumOperations(new int[] {1, 3, 2}, new int[] {2, 1, 4}),
                equalTo(5L));
    }
}
