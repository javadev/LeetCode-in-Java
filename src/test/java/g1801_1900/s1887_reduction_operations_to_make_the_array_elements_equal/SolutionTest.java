package g1801_1900.s1887_reduction_operations_to_make_the_array_elements_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reductionOperations() {
        assertThat(new Solution().reductionOperations(new int[] {5, 1, 3}), equalTo(3));
    }

    @Test
    void reductionOperations2() {
        assertThat(new Solution().reductionOperations(new int[] {1, 1, 1}), equalTo(0));
    }

    @Test
    void reductionOperations3() {
        assertThat(new Solution().reductionOperations(new int[] {1, 1, 2, 2, 3}), equalTo(4));
    }
}
