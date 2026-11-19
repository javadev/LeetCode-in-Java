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
}
