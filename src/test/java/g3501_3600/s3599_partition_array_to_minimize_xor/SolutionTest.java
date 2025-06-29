package g3501_3600.s3599_partition_array_to_minimize_xor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minXor() {
        assertThat(new Solution().minXor(new int[] {1, 2, 3}, 2), equalTo(1));
    }

    @Test
    void minXor2() {
        assertThat(new Solution().minXor(new int[] {2, 3, 3, 2}, 3), equalTo(2));
    }

    @Test
    void minXor3() {
        assertThat(new Solution().minXor(new int[] {1, 1, 2, 3, 1}, 2), equalTo(0));
    }
}
