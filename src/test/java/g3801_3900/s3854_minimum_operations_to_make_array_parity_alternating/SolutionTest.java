package g3801_3900.s3854_minimum_operations_to_make_array_parity_alternating;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsMinimumOperationsAndResultingRange() {
        Solution solution = new Solution();

        assertThat(
                solution.makeParityAlternating(new int[] {-2, -3, 1, 4}),
                equalTo(new int[] {2, 6}));
        assertThat(solution.makeParityAlternating(new int[] {0, 2, -2}), equalTo(new int[] {1, 3}));
        assertThat(solution.makeParityAlternating(new int[] {7}), equalTo(new int[] {0, 0}));
    }
}
