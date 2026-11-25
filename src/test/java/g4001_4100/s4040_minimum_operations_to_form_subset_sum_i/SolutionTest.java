package g4001_4100.s4040_minimum_operations_to_form_subset_sum_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {1, 2, 8}, 7), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {1, 2, 4}, 7), equalTo(0));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {2, 4}, 1), equalTo(1));
    }

    @Test
    void minOperations4() {
        assertThat(new Solution().minOperations(new int[] {}, 0), equalTo(0));
    }
}

