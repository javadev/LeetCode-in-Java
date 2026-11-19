package g4001_4100.s4017_peaks_in_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOfPeaks() {
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {1, 3, 2, 4},
                                new int[][] {{1, 0, 3}, {2, 1, 1}, {1, 0, 3}}),
                equalTo(new long[] {2L, 0L}));
    }

    @Test
    void countOfPeaks2() {
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {9, 8, 9, 8},
                                new int[][] {{1, 1, 3}, {2, 2, 1}, {1, 0, 2}}),
                equalTo(new long[] {1L, 0L}));
    }

    @Test
    void countOfPeaks3() {
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {3, 6, 2, 7, 1},
                                new int[][] {{1, 1, 3}, {2, 3, 0}, {1, 0, 4}}),
                equalTo(new long[] {0L, 3L}));
    }

    @Test
    void countOfPeaks4() {
        // n < 3, no peaks can exist
        assertThat(
                new Solution().countOfPeaks(new int[] {5, 10}, new int[][] {{1, 0, 1}}),
                equalTo(new long[] {0L}));
    }

    @Test
    void countOfPeaks5() {
        assertThat(
                new Solution().countOfPeaks(new int[] {7}, new int[][] {{1, 0, 0}}),
                equalTo(new long[] {0L}));
    }

    @Test
    void countOfPeaks6() {
        // Range with fewer than 3 elements yields 0
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {1, 3, 2, 4, 1}, new int[][] {{1, 0, 1}, {1, 2, 3}}),
                equalTo(new long[] {0L, 0L}));
    }

    @Test
    void countOfPeaks7() {
        assertThat(
                new Solution().countOfPeaks(new int[] {1, 2, 3, 4, 5}, new int[][] {{1, 0, 4}}),
                equalTo(new long[] {0L}));
    }

    @Test
    void countOfPeaks8() {
        assertThat(
                new Solution().countOfPeaks(new int[] {5, 4, 3, 2, 1}, new int[][] {{1, 0, 4}}),
                equalTo(new long[] {0L}));
    }

    @Test
    void countOfPeaks9() {
        // Array: 1 5 1 5 1 5 1 -> peaks at indices 1, 3, 5
        assertThat(
                new Solution()
                        .countOfPeaks(new int[] {1, 5, 1, 5, 1, 5, 1}, new int[][] {{1, 0, 6}}),
                equalTo(new long[] {13L}));
    }

    @Test
    void countOfPeaks10() {
        // No type-1 queries, result array is empty
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {1, 3, 2, 4, 1}, new int[][] {{2, 1, 10}, {2, 3, 0}}),
                equalTo(new long[] {}));
    }

    @Test
    void countOfPeaks11() {
        // Initially no peak in [0,3]; update makes index 2 a peak
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {1, 2, 3, 4},
                                new int[][] {{1, 0, 3}, {2, 2, 10}, {1, 0, 3}}),
                equalTo(new long[] {0L, 2L}));
    }

    @Test
    void countOfPeaks12() {
        // Initially a peak at index 1; update removes it
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {1, 5, 1, 2},
                                new int[][] {{1, 0, 3}, {2, 1, 0}, {1, 0, 3}}),
                equalTo(new long[] {2L, 0L}));
    }

    @Test
    void countOfPeaks13() {
        // Array: 1 5 1 5 1, peaks at index 1 and 3
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {1, 5, 1, 5, 1},
                                new int[][] {{1, 0, 2}, {1, 2, 4}, {1, 0, 4}}),
                equalTo(new long[] {1L, 1L, 5L}));
    }

    @Test
    void countOfPeaks14() {
        // Update the last index, affecting peak at index n-2
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {1, 2, 3, 4, 5},
                                new int[][] {{1, 0, 4}, {2, 4, 0}, {1, 0, 4}}),
                equalTo(new long[] {0L, 3L}));
    }

    @Test
    void countOfPeaks15() {
        // All equal -> no peaks (peak requires strictly greater)
        assertThat(
                new Solution().countOfPeaks(new int[] {3, 3, 3, 3, 3}, new int[][] {{1, 0, 4}}),
                equalTo(new long[] {0L}));
    }
}
