package g2601_2700.s2654_minimum_number_of_operations_to_make_all_array_elements_equal_to_1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {2, 6, 3, 4}), equalTo(4));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {2, 10, 6, 14}), equalTo(-1));
    }
}
