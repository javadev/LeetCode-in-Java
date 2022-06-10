package g2001_2100.s2050_parallel_courses_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTime() {
        assertThat(
                new Solution().minimumTime(3, new int[][] {{1, 3}, {2, 3}}, new int[] {3, 2, 5}),
                equalTo(8));
    }

    @Test
    void minimumTime2() {
        assertThat(
                new Solution()
                        .minimumTime(
                                5,
                                new int[][] {{1, 5}, {2, 5}, {3, 5}, {3, 4}, {4, 5}},
                                new int[] {1, 2, 3, 4, 5}),
                equalTo(12));
    }
}
