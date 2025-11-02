package g3701_3800.s3733_minimum_time_to_complete_all_deliveries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTime() {
        assertThat(new Solution().minimumTime(new int[] {3, 1}, new int[] {2, 3}), equalTo(5L));
    }

    @Test
    void minimumTime2() {
        assertThat(new Solution().minimumTime(new int[] {1, 3}, new int[] {2, 2}), equalTo(7L));
    }

    @Test
    void minimumTime3() {
        assertThat(new Solution().minimumTime(new int[] {2, 1}, new int[] {3, 4}), equalTo(3L));
    }
}
