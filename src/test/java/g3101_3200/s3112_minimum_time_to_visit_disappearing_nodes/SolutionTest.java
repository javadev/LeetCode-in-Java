package g3101_3200.s3112_minimum_time_to_visit_disappearing_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTime() {
        assertThat(
                new Solution()
                        .minimumTime(
                                3,
                                new int[][] {{0, 1, 2}, {1, 2, 1}, {0, 2, 4}},
                                new int[] {1, 1, 5}),
                equalTo(new int[] {0, -1, 4}));
    }

    @Test
    void minimumTime2() {
        assertThat(
                new Solution()
                        .minimumTime(
                                3,
                                new int[][] {{0, 1, 2}, {1, 2, 1}, {0, 2, 4}},
                                new int[] {1, 3, 5}),
                equalTo(new int[] {0, 2, 3}));
    }

    @Test
    void minimumTime3() {
        assertThat(
                new Solution().minimumTime(2, new int[][] {{0, 1, 1}}, new int[] {1, 1}),
                equalTo(new int[] {0, -1}));
    }
}
