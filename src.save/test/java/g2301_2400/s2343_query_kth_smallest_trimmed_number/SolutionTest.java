package g2301_2400.s2343_query_kth_smallest_trimmed_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestTrimmedNumbers() {
        assertThat(
                new Solution()
                        .smallestTrimmedNumbers(
                                new String[] {"102", "473", "251", "814"},
                                new int[][] {{1, 1}, {2, 3}, {4, 2}, {1, 2}}),
                equalTo(new int[] {2, 2, 1, 0}));
    }

    @Test
    void smallestTrimmedNumbers2() {
        assertThat(
                new Solution()
                        .smallestTrimmedNumbers(
                                new String[] {"24", "37", "96", "04"},
                                new int[][] {{2, 1}, {2, 2}}),
                equalTo(new int[] {3, 0}));
    }
}
