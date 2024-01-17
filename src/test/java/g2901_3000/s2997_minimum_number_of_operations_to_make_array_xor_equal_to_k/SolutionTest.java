package g2901_3000.s2997_minimum_number_of_operations_to_make_array_xor_equal_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {2, 1, 3, 4}, 1), equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {2, 0, 2, 0}, 0), equalTo(0));
    }
}
