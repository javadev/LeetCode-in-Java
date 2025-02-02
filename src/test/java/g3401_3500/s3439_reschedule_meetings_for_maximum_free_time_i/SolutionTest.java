package g3401_3500.s3439_reschedule_meetings_for_maximum_free_time_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFreeTime() {
        assertThat(
                new Solution().maxFreeTime(5, 1, new int[] {1, 3}, new int[] {2, 5}), equalTo(2));
    }

    @Test
    void maxFreeTime2() {
        assertThat(
                new Solution().maxFreeTime(10, 1, new int[] {0, 2, 9}, new int[] {1, 4, 10}),
                equalTo(6));
    }

    @Test
    void maxFreeTime3() {
        assertThat(
                new Solution()
                        .maxFreeTime(5, 2, new int[] {0, 1, 2, 3, 4}, new int[] {1, 2, 3, 4, 5}),
                equalTo(0));
    }
}
