package g1001_1100.s1029_two_city_scheduling;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void twoCitySchedCost() {
        assertThat(
                new Solution()
                        .twoCitySchedCost(new int[][] {{10, 20}, {30, 200}, {400, 50}, {30, 20}}),
                equalTo(110));
    }

    @Test
    void twoCitySchedCost2() {
        assertThat(
                new Solution()
                        .twoCitySchedCost(
                                new int[][] {
                                    {259, 770},
                                    {448, 54},
                                    {926, 667},
                                    {184, 139},
                                    {840, 118},
                                    {577, 469}
                                }),
                equalTo(1859));
    }

    @Test
    void twoCitySchedCost3() {
        assertThat(
                new Solution()
                        .twoCitySchedCost(
                                new int[][] {
                                    {515, 563},
                                    {451, 713},
                                    {537, 709},
                                    {343, 819},
                                    {855, 779},
                                    {457, 60},
                                    {650, 359},
                                    {631, 42}
                                }),
                equalTo(3086));
    }
}
