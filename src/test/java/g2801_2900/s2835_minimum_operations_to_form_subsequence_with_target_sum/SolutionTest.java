package g2801_2900.s2835_minimum_operations_to_form_subsequence_with_target_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(Arrays.asList(1, 2, 8), 7), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(Arrays.asList(1, 32, 1, 2), 12), equalTo(2));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(Arrays.asList(1, 32, 1, 2), 12), equalTo(2));
    }
}
