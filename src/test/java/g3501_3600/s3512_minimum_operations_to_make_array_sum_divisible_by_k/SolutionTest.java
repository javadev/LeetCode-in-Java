package g3501_3600.s3512_minimum_operations_to_make_array_sum_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {3, 9, 7}, 5), equalTo(4));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {4, 1, 3}, 4), equalTo(0));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {3, 2}, 6), equalTo(5));
    }
}
