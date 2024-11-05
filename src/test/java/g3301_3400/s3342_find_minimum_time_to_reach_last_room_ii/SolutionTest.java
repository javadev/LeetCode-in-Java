package g3301_3400.s3342_find_minimum_time_to_reach_last_room_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTimeToReach() {
        assertThat(new Solution().minTimeToReach(new int[][] {{0, 4}, {4, 4}}), equalTo(7));
    }

    @Test
    void minTimeToReach2() {
        assertThat(
                new Solution().minTimeToReach(new int[][] {{0, 0, 0, 0}, {0, 0, 0, 0}}),
                equalTo(6));
    }

    @Test
    void minTimeToReach3() {
        assertThat(new Solution().minTimeToReach(new int[][] {{0, 1}, {1, 2}}), equalTo(4));
    }
}
