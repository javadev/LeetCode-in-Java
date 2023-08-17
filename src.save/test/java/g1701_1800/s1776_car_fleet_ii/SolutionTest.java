package g1701_1800.s1776_car_fleet_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getCollisionTimes() {
        assertThat(
                new Solution().getCollisionTimes(new int[][] {{1, 2}, {2, 1}, {4, 3}, {7, 2}}),
                equalTo(new double[] {1.00000, -1.00000, 3.00000, -1.00000}));
    }

    @Test
    void getCollisionTimes2() {
        assertThat(
                new Solution().getCollisionTimes(new int[][] {{3, 4}, {5, 4}, {6, 3}, {9, 1}}),
                equalTo(new double[] {2.00000, 1.00000, 1.50000, -1.00000}));
    }
}
