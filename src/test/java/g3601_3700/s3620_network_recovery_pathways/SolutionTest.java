package g3601_3700.s3620_network_recovery_pathways;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxPathScore() {
        assertThat(
                new Solution()
                        .findMaxPathScore(
                                new int[][] {{0, 1, 5}, {1, 3, 10}, {0, 2, 3}, {2, 3, 4}},
                                new boolean[] {true, true, true, true},
                                10L),
                equalTo(3));
    }

    @Test
    void findMaxPathScore2() {
        assertThat(
                new Solution()
                        .findMaxPathScore(
                                new int[][] {
                                    {0, 1, 7}, {1, 4, 5}, {0, 2, 6}, {2, 3, 6}, {3, 4, 2}, {2, 4, 6}
                                },
                                new boolean[] {true, true, true, false, true},
                                12L),
                equalTo(6));
    }
}
