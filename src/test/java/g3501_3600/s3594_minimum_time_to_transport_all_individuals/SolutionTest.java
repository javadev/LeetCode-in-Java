package g3501_3600.s3594_minimum_time_to_transport_all_individuals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTime() {
        assertThat(
                new Solution().minTime(1, 1, 2, new int[] {5}, new double[] {1.0, 1.3}),
                equalTo(5.0));
    }

    @Test
    void minTime2() {
        assertThat(
                new Solution().minTime(3, 2, 3, new int[] {2, 5, 8}, new double[] {1.0, 1.5, 0.75}),
                equalTo(14.5));
    }

    @Test
    void minTime3() {
        assertThat(
                new Solution().minTime(2, 1, 2, new int[] {10, 10}, new double[] {2.0, 2.0}),
                equalTo(-1.0));
    }
}
