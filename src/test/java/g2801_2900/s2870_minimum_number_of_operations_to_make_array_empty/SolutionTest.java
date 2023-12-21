package g2801_2900.s2870_minimum_number_of_operations_to_make_array_empty;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {2, 3, 3, 2, 2, 4, 2, 3, 4}), equalTo(4));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {2, 1, 2, 2, 3, 3}), equalTo(-1));
    }
}
