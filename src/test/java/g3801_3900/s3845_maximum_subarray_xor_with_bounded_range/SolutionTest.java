package g3801_3900.s3845_maximum_subarray_xor_with_bounded_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxXor() {
        assertThat(new Solution().maxXor(new int[] {5, 4, 5, 6}, 2), equalTo(7));
    }

    @Test
    void maxXor2() {
        assertThat(new Solution().maxXor(new int[] {5, 4, 5, 6}, 1), equalTo(6));
    }
}
