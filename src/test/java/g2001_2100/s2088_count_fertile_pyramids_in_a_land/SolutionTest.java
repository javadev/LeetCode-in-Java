package g2001_2100.s2088_count_fertile_pyramids_in_a_land;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPyramids() {
        assertThat(
                new Solution().countPyramids(new int[][] {{0, 1, 1, 0}, {1, 1, 1, 1}}), equalTo(2));
    }

    @Test
    void countPyramids2() {
        assertThat(new Solution().countPyramids(new int[][] {{1, 1, 1}, {1, 1, 1}}), equalTo(2));
    }

    @Test
    void countPyramids3() {
        assertThat(
                new Solution()
                        .countPyramids(
                                new int[][] {
                                    {1, 1, 1, 1, 0},
                                    {1, 1, 1, 1, 1},
                                    {1, 1, 1, 1, 1},
                                    {0, 1, 0, 0, 1}
                                }),
                equalTo(13));
    }
}
