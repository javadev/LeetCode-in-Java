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

    @Test
    void assignTasks3() {
        assertThat(
                new Solution().assignTasks(new int[] {1}, new int[] {1, 2, 3}),
                equalTo(new int[] {0, 0, 0}));
    }

    @Test
    void assignTasks4() {
        assertThat(
                new Solution().assignTasks(new int[] {2, 2, 2}, new int[] {1, 2, 1, 2}),
                equalTo(new int[] {0, 0, 1, 0}));
    }

    @Test
    void assignTasks5() {
        assertThat(
                new Solution().assignTasks(new int[] {1, 2}, new int[] {1, 2, 3, 4}),
                equalTo(new int[] {0, 0, 1, 0}));
    }

    @Test
    void assignTasks6() {
        assertThat(
                new Solution().assignTasks(new int[] {1, 2, 3}, new int[] {}),
                equalTo(new int[] {}));
    }

    @Test
    void assignTasks7() {
        assertThat(
                new Solution().assignTasks(new int[] {3, 1, 4}, new int[] {5}),
                equalTo(new int[] {1}));
    }

    @Test
    void assignTasks8() {
        assertThat(
                new Solution().assignTasks(new int[] {1, 2}, new int[] {2, 2, 2}),
                equalTo(new int[] {0, 1, 0}));
    }

    @Test
    void assignTasks9() {
        int[] servers = {5, 3, 1, 4, 2};
        int[] tasks = {1, 3, 5, 7, 9, 11};
        assertThat(
                new Solution().assignTasks(servers, tasks), equalTo(new int[] {2, 2, 4, 1, 2, 3}));
    }
}
