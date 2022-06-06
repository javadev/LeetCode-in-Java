package g2101_2200.s2188_minimum_time_to_finish_the_race;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumFinishTime() {
        assertThat(
                new Solution().minimumFinishTime(new int[][] {{2, 3}, {3, 4}}, 5, 4), equalTo(21));
    }

    @Test
    void minimumFinishTime2() {
        assertThat(
                new Solution().minimumFinishTime(new int[][] {{1, 10}, {2, 2}, {3, 4}}, 6, 5),
                equalTo(25));
    }
}
