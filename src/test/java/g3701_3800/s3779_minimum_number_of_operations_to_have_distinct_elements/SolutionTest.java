package g3701_3800.s3779_minimum_number_of_operations_to_have_distinct_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {3, 8, 3, 6, 5, 8}), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {2, 2}), equalTo(1));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {4, 3, 5, 1, 2}), equalTo(0));
    }
}
