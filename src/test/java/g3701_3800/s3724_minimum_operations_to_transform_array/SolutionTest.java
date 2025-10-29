package g3701_3800.s3724_minimum_operations_to_transform_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(
                new Solution().minOperations(new int[] {2, 8}, new int[] {1, 7, 3}), equalTo(4L));
    }

    @Test
    void minOperations2() {
        assertThat(
                new Solution().minOperations(new int[] {1, 3, 6}, new int[] {2, 4, 5, 3}),
                equalTo(4L));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {2}, new int[] {3, 4}), equalTo(3L));
    }
}
