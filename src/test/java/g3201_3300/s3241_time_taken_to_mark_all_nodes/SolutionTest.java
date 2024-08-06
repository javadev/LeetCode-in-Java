package g3201_3300.s3241_time_taken_to_mark_all_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void timeTaken() {
        assertThat(
                new Solution().timeTaken(new int[][] {{0, 1}, {0, 2}}),
                equalTo(new int[] {2, 4, 3}));
    }

    @Test
    void timeTaken2() {
        assertThat(new Solution().timeTaken(new int[][] {{0, 1}}), equalTo(new int[] {1, 2}));
    }

    @Test
    void timeTaken3() {
        assertThat(
                new Solution().timeTaken(new int[][] {{2, 4}, {0, 1}, {2, 3}, {0, 2}}),
                equalTo(new int[] {4, 6, 3, 5, 5}));
    }
}
