package g3001_3100.s3065_minimum_operations_to_exceed_threshold_value_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {2, 11, 10, 1, 3}, 10), equalTo(3));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {1, 1, 2, 4, 9}, 1), equalTo(0));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {1, 1, 2, 4, 9}, 9), equalTo(4));
    }
}
