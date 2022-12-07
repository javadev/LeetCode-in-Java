package g2401_2500.s2432_the_employee_that_worked_on_the_longest_task;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hardestWorker() {
        assertThat(
                new Solution().hardestWorker(new int[][] {{0, 3}, {2, 5}, {0, 9}, {1, 15}}),
                equalTo(1));
    }

    @Test
    void hardestWorker2() {
        assertThat(
                new Solution().hardestWorker(new int[][] {{1, 1}, {3, 7}, {2, 12}, {7, 17}}),
                equalTo(3));
    }

    @Test
    void hardestWorker3() {
        assertThat(new Solution().hardestWorker(new int[][] {{0, 10}, {10, 20}}), equalTo(0));
    }
}
