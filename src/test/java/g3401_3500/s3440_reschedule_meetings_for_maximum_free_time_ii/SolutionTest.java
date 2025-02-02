package g3401_3500.s3440_reschedule_meetings_for_maximum_free_time_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFreeTime() {
        assertThat(new Solution().maxFreeTime(5, new int[] {1, 3}, new int[] {2, 5}), equalTo(2));
    }

    @Test
    void maxFreeTime2() {
        assertThat(
                new Solution().maxFreeTime(10, new int[] {0, 7, 9}, new int[] {1, 8, 10}),
                equalTo(7));
    }

    @Test
    void maxFreeTime3() {
        assertThat(
                new Solution().maxFreeTime(10, new int[] {0, 3, 7, 9}, new int[] {1, 4, 8, 10}),
                equalTo(6));
    }

    @Test
    void maxFreeTime4() {
        assertThat(
                new Solution().maxFreeTime(5, new int[] {0, 1, 2, 3, 4}, new int[] {1, 2, 3, 4, 5}),
                equalTo(0));
    }
}
