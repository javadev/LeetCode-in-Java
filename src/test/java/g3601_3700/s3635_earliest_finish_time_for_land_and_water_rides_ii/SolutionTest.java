package g3601_3700.s3635_earliest_finish_time_for_land_and_water_rides_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void earliestFinishTime() {
        assertThat(
                new Solution()
                        .earliestFinishTime(
                                new int[] {2, 8}, new int[] {4, 1}, new int[] {6}, new int[] {3}),
                equalTo(9));
    }

    @Test
    void earliestFinishTime2() {
        assertThat(
                new Solution()
                        .earliestFinishTime(
                                new int[] {5}, new int[] {3}, new int[] {1}, new int[] {10}),
                equalTo(14));
    }
}
