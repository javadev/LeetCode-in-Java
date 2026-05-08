package g3701_3800.s3762_minimum_operations_to_equalize_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        long[] result = new Solution().minOperations(new int[] {1, 3, 5}, 2, new int[][] {{0, 2}});
        assertThat(result[0], equalTo(2L));
    }

    @Test
    void minOperations2() {
        long[] result = new Solution().minOperations(new int[] {1, 3, 5}, 2, new int[][] {{0, 1}});
        assertThat(result[0], equalTo(1L));
    }

    @Test
    void minOperations3() {
        long[] result = new Solution().minOperations(new int[] {1, 2}, 2, new int[][] {{0, 1}});
        assertThat(result[0], equalTo(-1L));
    }
}
