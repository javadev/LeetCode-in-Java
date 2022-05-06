package g1801_1900.s1882_process_tasks_using_servers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void assignTasks() {
        assertThat(
                new Solution().assignTasks(new int[] {3, 3, 2}, new int[] {1, 2, 3, 2, 1, 2}),
                equalTo(new int[] {2, 2, 0, 2, 1, 2}));
    }

    @Test
    void assignTasks2() {
        assertThat(
                new Solution()
                        .assignTasks(new int[] {5, 1, 4, 3, 2}, new int[] {2, 1, 2, 4, 5, 2, 1}),
                equalTo(new int[] {1, 4, 1, 4, 1, 3, 2}));
    }
}
