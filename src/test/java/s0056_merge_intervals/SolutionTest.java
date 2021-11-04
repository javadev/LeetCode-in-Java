package s0056_merge_intervals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void mergeIntervals() {
        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        int[][] actual = new Solution().merge(input);

        for (int i = 0; i < expected.length; i++) {
            assertThat(actual[i], equalTo(expected[i]));
        }
    }
}
