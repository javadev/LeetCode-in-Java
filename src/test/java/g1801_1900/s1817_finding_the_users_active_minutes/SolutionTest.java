package g1801_1900.s1817_finding_the_users_active_minutes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findingUsersActiveMinutes() {
        assertThat(
                new Solution()
                        .findingUsersActiveMinutes(
                                new int[][] {{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}}, 5),
                equalTo(new int[] {0, 2, 0, 0, 0}));
    }

    @Test
    void findingUsersActiveMinutes2() {
        assertThat(
                new Solution().findingUsersActiveMinutes(new int[][] {{1, 1}, {2, 2}, {2, 3}}, 4),
                equalTo(new int[] {1, 1, 0, 0}));
    }
}
