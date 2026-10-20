package g3901_4000.s3965_finish_time_of_tasks_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void finishTime() {
        assertThat(
                new Solution().finishTime(3, new int[][] {{0, 1}, {1, 2}}, new int[] {9, 5, 3}),
                equalTo(17));
    }

    @Test
    void finishTime2() {
        assertThat(
                new Solution().finishTime(3, new int[][] {{0, 1}, {0, 2}}, new int[] {4, 7, 6}),
                equalTo(12));
    }
}
