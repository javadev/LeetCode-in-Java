package g2101_2200.s2170_minimum_operations_to_make_the_array_alternating;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(new Solution().minimumOperations(new int[] {3, 1, 3, 2, 4, 3}), equalTo(3));
    }

    @Test
    void minimumOperations2() {
        assertThat(new Solution().minimumOperations(new int[] {1, 2, 2, 2, 2}), equalTo(2));
    }
}
