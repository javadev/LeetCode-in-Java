package g3801_3900.s3863_minimum_operations_to_sort_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsMinimumSortableSubstringOperations() {
        Solution solution = new Solution();

        assertThat(solution.minOperations("dog"), equalTo(1));
        assertThat(solution.minOperations("card"), equalTo(2));
        assertThat(solution.minOperations("gf"), equalTo(-1));
        assertThat(solution.minOperations("abc"), equalTo(0));
    }
}
