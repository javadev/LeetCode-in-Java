package g3901_4000.s3986_number_of_elapsed_seconds_between_two_times;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void secondsBetweenTimes() {
        assertThat(new Solution().secondsBetweenTimes("01:00:00", "01:00:25"), equalTo(25));
    }

    @Test
    void secondsBetweenTimes2() {
        assertThat(new Solution().secondsBetweenTimes("12:34:56", "13:00:00"), equalTo(1504));
    }

    @Test
    void secondsBetweenTimes3() {
        assertThat(new Solution().secondsBetweenTimes("00:00:00", "00:00:00"), equalTo(0));
    }
}
