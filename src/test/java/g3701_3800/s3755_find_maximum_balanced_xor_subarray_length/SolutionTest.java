package g3701_3800.s3755_find_maximum_balanced_xor_subarray_length;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxBalancedSubarray() {
        assertThat(new Solution().maxBalancedSubarray(new int[] {3, 1, 3, 2, 0}), equalTo(4));
    }

    @Test
    void maxBalancedSubarray2() {
        assertThat(
                new Solution().maxBalancedSubarray(new int[] {3, 2, 8, 5, 4, 14, 9, 15}),
                equalTo(8));
    }
}
