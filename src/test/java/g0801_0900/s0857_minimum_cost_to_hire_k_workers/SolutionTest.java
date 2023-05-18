package g0801_0900.s0857_minimum_cost_to_hire_k_workers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

    int n = 100000;

    @Test
    void mincostToHireWorkers() {
        assertThat(
                new Solution()
                        .mincostToHireWorkers(new int[] {10, 20, 5}, new int[] {70, 50, 30}, 2),
                equalTo(105.00000));
    }

    @Test
    void mincostToHireWorkers2() {
        assertThat(
                (double)
                                Math.round(
                                        new Solution()
                                                        .mincostToHireWorkers(
                                                                new int[] {3, 1, 10, 10, 1},
                                                                new int[] {4, 8, 2, 2, 7},
                                                                3)
                                                * n)
                        / n,
                equalTo(30.66667));
    }
}
