package g3301_3400.s3396_minimum_number_of_operations_to_make_elements_in_array_distinct;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(
                new Solution().minimumOperations(new int[] {1, 2, 3, 4, 2, 3, 3, 5, 7}),
                equalTo(2));
    }

    @Test
    void minimumOperations2() {
        assertThat(new Solution().minimumOperations(new int[] {4, 5, 6, 4, 4}), equalTo(2));
    }

    @Test
    void minimumOperations3() {
        assertThat(new Solution().minimumOperations(new int[] {6, 7, 8, 9}), equalTo(0));
    }
}
