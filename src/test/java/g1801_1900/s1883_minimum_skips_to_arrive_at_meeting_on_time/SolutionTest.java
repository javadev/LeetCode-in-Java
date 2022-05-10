package g1801_1900.s1883_minimum_skips_to_arrive_at_meeting_on_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSkips() {
        assertThat(new Solution().minSkips(new int[] {1, 3, 2}, 4, 2), equalTo(1));
    }

    @Test
    void minSkips2() {
        assertThat(new Solution().minSkips(new int[] {7, 3, 5, 5}, 2, 10), equalTo(2));
    }

    @Test
    void minSkips3() {
        assertThat(new Solution().minSkips(new int[] {7, 3, 5, 5}, 1, 10), equalTo(-1));
    }
}
