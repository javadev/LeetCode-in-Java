package g1301_1400.s1376_time_needed_to_inform_all_employees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfMinutes() {
        assertThat(new Solution().numOfMinutes(1, 0, new int[] {-1}, new int[] {0}), equalTo(0));
    }

    @Test
    void numOfMinutes2() {
        assertThat(
                new Solution()
                        .numOfMinutes(
                                6, 2, new int[] {2, 2, -1, 2, 2, 2}, new int[] {0, 0, 1, 0, 0, 0}),
                equalTo(1));
    }
}
