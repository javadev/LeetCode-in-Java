package g3001_3100.s3095_shortest_subarray_with_or_at_least_k_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSubarrayLength() {
        assertThat(new Solution().minimumSubarrayLength(new int[] {1, 2, 3}, 2), equalTo(1));
    }

    @Test
    void minimumSubarrayLength2() {
        assertThat(new Solution().minimumSubarrayLength(new int[] {2, 1, 8}, 10), equalTo(3));
    }

    @Test
    void minimumSubarrayLength3() {
        assertThat(new Solution().minimumSubarrayLength(new int[] {1, 2}, 0), equalTo(1));
    }
}
