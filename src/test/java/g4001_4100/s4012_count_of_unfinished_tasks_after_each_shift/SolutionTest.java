package g4001_4100.s4012_count_of_unfinished_tasks_after_each_shift;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countTasks() {
        assertThat(
                new Solution().countTasks(new int[] {1, 4, 4}, new int[] {9, 1, 4}),
                equalTo(new int[] {0, 2, 1}));
    }

    @Test
    void countTasks2() {
        assertThat(
                new Solution().countTasks(new int[] {2, 3, 4}, new int[] {20, 4, 5}),
                equalTo(new int[] {0, 2, 0}));
    }

    @Test
    void countTasks3() {
        assertThat(
                new Solution().countTasks(new int[] {4, 2}, new int[] {3, 6, 1}),
                equalTo(new int[] {2, 0, 2}));
    }
}
