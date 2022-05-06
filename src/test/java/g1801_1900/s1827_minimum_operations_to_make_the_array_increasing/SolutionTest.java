package g1801_1900.s1827_minimum_operations_to_make_the_array_increasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {1, 1, 1}), equalTo(3));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {1, 5, 2, 4, 1}), equalTo(14));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {8}), equalTo(0));
    }
}
