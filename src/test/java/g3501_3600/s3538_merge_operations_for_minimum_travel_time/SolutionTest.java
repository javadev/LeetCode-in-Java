package g3501_3600.s3538_merge_operations_for_minimum_travel_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTravelTime() {
        assertThat(
                new Solution()
                        .minTravelTime(10, 4, 1, new int[] {0, 3, 8, 10}, new int[] {5, 8, 3, 6}),
                equalTo(62));
    }

    @Test
    void minTravelTime2() {
        assertThat(
                new Solution()
                        .minTravelTime(
                                5, 5, 1, new int[] {0, 1, 2, 3, 5}, new int[] {8, 3, 9, 3, 3}),
                equalTo(34));
    }
}
