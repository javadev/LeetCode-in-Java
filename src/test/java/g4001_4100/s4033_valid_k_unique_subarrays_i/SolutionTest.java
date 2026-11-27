package g4001_4100.s4033_valid_k_unique_subarrays_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validSubarrays() {
        assertThat(
                new Solution().validSubarrays(new int[] {1, 1}, 1, new int[][] {{0, 1}, {0, 0}}),
                equalTo(new boolean[] {true, false}));
    }

    @Test
    void validSubarrays2() {
        assertThat(
                new Solution()
                        .validSubarrays(
                                new int[] {1, 2, 1, 2}, 2, new int[][] {{0, 3}, {0, 1}, {1, 2}}),
                equalTo(new boolean[] {true, false, false}));
    }

    @Test
    void validSubarrays3() {
        assertThat(
                new Solution().validSubarrays(new int[] {1, 2}, 2, new int[][] {}),
                equalTo(new boolean[] {}));
    }
}
