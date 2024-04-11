package g3101_3200.s3105_longest_strictly_increasing_or_strictly_decreasing_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestMonotonicSubarray() {
        assertThat(new Solution().longestMonotonicSubarray(new int[] {1, 4, 3, 3, 2}), equalTo(2));
    }

    @Test
    void longestMonotonicSubarray2() {
        assertThat(new Solution().longestMonotonicSubarray(new int[] {3, 3, 3, 3}), equalTo(1));
    }
}
