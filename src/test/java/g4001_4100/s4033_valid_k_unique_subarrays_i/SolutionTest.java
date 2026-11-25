package g4001_4100.s4033_valid_k_unique_subarrays_i;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validSubarrays() {
        assertArrayEquals(
                new boolean[] {true, false},
                new Solution().validSubarrays(new int[] {1, 1}, 1, new int[][] {{0, 1}, {0, 0}}));
    }

    @Test
    void validSubarrays2() {
        assertArrayEquals(
                new boolean[] {true, false, false},
                new Solution()
                        .validSubarrays(
                                new int[] {1, 2, 1, 2}, 2, new int[][] {{0, 3}, {0, 1}, {1, 2}}));
    }

    @Test
    void validSubarrays3() {
        assertArrayEquals(
                new boolean[] {},
                new Solution().validSubarrays(new int[] {1, 2}, 2, new int[][] {}));
    }
}
