package g3901_4000.s3977_minimum_time_to_reach_target_with_limited_power;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTimeMaxPower() {
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                5,
                                new int[][] {{0, 1, 1}, {1, 4, 1}, {0, 2, 1}, {2, 3, 1}, {3, 4, 1}},
                                4,
                                new int[] {2, 3, 1, 1, 1},
                                0,
                                4),
                equalTo(new long[] {3, 0}));
    }

    @Test
    void minTimeMaxPower2() {
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                3,
                                new int[][] {{0, 1, 2}, {1, 2, 2}, {2, 0, 2}},
                                3,
                                new int[] {1, 1, 1},
                                1,
                                1),
                equalTo(new long[] {0, 3}));
    }

    @Test
    void minTimeMaxPower3() {
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                4,
                                new int[][] {{0, 1, 3}, {2, 3, 4}},
                                3,
                                new int[] {1, 1, 1, 1},
                                0,
                                3),
                equalTo(new long[] {-1, -1}));
    }

    @Test
    void minTimeMaxPower4() {
        // Single node, source == target, cost of source is never paid
        assertThat(
                new Solution().minTimeMaxPower(1, new int[][] {}, 5, new int[] {10}, 0, 0),
                equalTo(new long[] {0, 5}));
    }

    @Test
    void minTimeMaxPower5() {
        // Simple chain 0 -> 1 -> 2, costs paid at 0 and 1
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                3,
                                new int[][] {{0, 1, 2}, {1, 2, 3}},
                                10,
                                new int[] {3, 4, 100},
                                0,
                                2),
                equalTo(new long[] {5, 3}));
    }

    @Test
    void minTimeMaxPower6() {
        // Not enough power to leave the source
        assertThat(
                new Solution()
                        .minTimeMaxPower(2, new int[][] {{0, 1, 1}}, 1, new int[] {2, 0}, 0, 1),
                equalTo(new long[] {-1, -1}));
    }

    @Test
    void minTimeMaxPower7() {
        // Two paths with equal time, the one with more remaining power wins
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                4,
                                new int[][] {{0, 1, 1}, {0, 2, 1}, {1, 3, 1}, {2, 3, 1}},
                                10,
                                new int[] {1, 5, 2, 0},
                                0,
                                3),
                equalTo(new long[] {2, 7}));
    }

    @Test
    void minTimeMaxPower8() {
        // Faster path is blocked by a high cost node, slower path is used
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                4,
                                new int[][] {{0, 1, 1}, {1, 3, 1}, {0, 2, 2}, {2, 3, 2}},
                                5,
                                new int[] {1, 10, 1, 0},
                                0,
                                3),
                equalTo(new long[] {4, 3}));
    }

    @Test
    void minTimeMaxPower9() {
        // Minimum time takes priority over maximum power
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                4,
                                new int[][] {{0, 1, 1}, {1, 3, 1}, {0, 2, 5}, {2, 3, 5}},
                                10,
                                new int[] {0, 9, 0, 0},
                                0,
                                3),
                equalTo(new long[] {2, 1}));
    }

    @Test
    void minTimeMaxPower10() {
        // Edges are directed: reverse edge does not make target reachable
        assertThat(
                new Solution()
                        .minTimeMaxPower(2, new int[][] {{1, 0, 1}}, 5, new int[] {0, 0}, 0, 1),
                equalTo(new long[] {-1, -1}));
    }

    @Test
    void minTimeMaxPower11() {
        // Zero power and zero costs: travel still possible
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                3,
                                new int[][] {{0, 1, 4}, {1, 2, 6}},
                                0,
                                new int[] {0, 0, 0},
                                0,
                                2),
                equalTo(new long[] {10, 0}));
    }

    @Test
    void minTimeMaxPower12() {
        // Node 1 is first reached early with too little power,
        // then revisited later with more power, which allows reaching the target
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                5,
                                new int[][] {{0, 2, 1}, {2, 1, 1}, {0, 3, 1}, {3, 1, 2}, {1, 4, 1}},
                                6,
                                new int[] {0, 3, 5, 0, 0},
                                0,
                                4),
                equalTo(new long[] {4, 3}));
    }

    @Test
    void minTimeMaxPower13() {
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                5,
                                new int[][] {
                                    {4, 4, 9}, {0, 2, 2}, {4, 1, 1}, {0, 2, 9}, {0, 4, 1},
                                    {3, 4, 5}, {2, 1, 5}, {0, 0, 6}, {2, 4, 10}, {3, 4, 8},
                                    {2, 3, 3}, {0, 1, 1}, {4, 0, 5}, {0, 3, 4}, {0, 1, 10},
                                    {0, 0, 1}, {0, 2, 7}, {2, 0, 10}, {2, 0, 10}, {0, 3, 9}
                                },
                                5,
                                new int[] {4, 2, 1, 4, 2},
                                0,
                                4),
                equalTo(new long[] {1, 1}));
    }
}
