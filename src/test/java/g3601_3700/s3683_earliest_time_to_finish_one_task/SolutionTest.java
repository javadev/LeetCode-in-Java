package g3601_3700.s3683_earliest_time_to_finish_one_task;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void earliestTime() {
        assertThat(new Solution().earliestTime(new int[][] {{1, 6}, {2, 3}}), equalTo(5));
    }

    @Test
    void earliestTime2() {
        assertThat(
                new Solution().earliestTime(new int[][] {{100, 100}, {100, 100}, {100, 100}}),
                equalTo(200));
    }
}
