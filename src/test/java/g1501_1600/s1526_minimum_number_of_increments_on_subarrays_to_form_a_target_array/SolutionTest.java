package g1501_1600.s1526_minimum_number_of_increments_on_subarrays_to_form_a_target_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minNumberOperations() {
        assertThat(new Solution().minNumberOperations(new int[] {1, 2, 3, 2, 1}), equalTo(3));
    }

    @Test
    void minNumberOperations2() {
        assertThat(new Solution().minNumberOperations(new int[] {3, 1, 1, 2}), equalTo(4));
    }

    @Test
    void minNumberOperations3() {
        assertThat(new Solution().minNumberOperations(new int[] {3, 1, 5, 4, 2}), equalTo(7));
    }
}
