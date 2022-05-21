package g1901_2000.s1970_last_day_where_you_can_still_cross;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void latestDayToCross() {
        assertThat(
                new Solution().latestDayToCross(2, 2, new int[][] {{1, 1}, {2, 1}, {1, 2}, {2, 2}}),
                equalTo(2));
    }

    @Test
    void latestDayToCross2() {
        assertThat(
                new Solution().latestDayToCross(2, 2, new int[][] {{1, 1}, {1, 2}, {2, 1}, {2, 2}}),
                equalTo(1));
    }

    @Test
    void latestDayToCross3() {
        assertThat(
                new Solution()
                        .latestDayToCross(
                                3,
                                3,
                                new int[][] {
                                    {1, 2}, {2, 1}, {3, 3}, {2, 2}, {1, 1}, {1, 3}, {2, 3}, {3, 2},
                                    {3, 1}
                                }),
                equalTo(3));
    }
}
