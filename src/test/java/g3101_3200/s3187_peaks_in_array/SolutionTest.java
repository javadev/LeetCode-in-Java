package g3101_3200.s3187_peaks_in_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOfPeaks() {
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {3, 1, 4, 2, 5}, new int[][] {{2, 3, 4}, {1, 0, 4}}),
                equalTo(List.of(0)));
    }

    @Test
    void countOfPeaks2() {
        assertThat(
                new Solution()
                        .countOfPeaks(
                                new int[] {4, 1, 4, 2, 1, 5},
                                new int[][] {{2, 2, 4}, {1, 0, 2}, {1, 0, 4}}),
                equalTo(List.of(0, 1)));
    }
}
