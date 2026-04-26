package g3701_3800.s3748_count_stable_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countStableSubarrays() {
        assertThat(
                new Solution()
                        .countStableSubarrays(
                                new int[] {3, 1, 2}, new int[][] {{0, 1}, {1, 2}, {0, 2}}),
                equalTo(new long[] {2L, 3L, 4L}));
    }

    @Test
    void countStableSubarrays2() {
        assertThat(
                new Solution().countStableSubarrays(new int[] {2, 2}, new int[][] {{0, 1}, {0, 0}}),
                equalTo(new long[] {3L, 1L}));
    }
}
