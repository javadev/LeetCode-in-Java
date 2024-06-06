package g3101_3200.s3169_count_days_without_meetings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countDays() {
        assertThat(new Solution().countDays(10, new int[][] {{5, 7}, {1, 3}, {9, 10}}), equalTo(2));
    }

    @Test
    void countDays2() {
        assertThat(new Solution().countDays(5, new int[][] {{2, 4}, {1, 3}}), equalTo(1));
    }

    @Test
    void countDays3() {
        assertThat(new Solution().countDays(6, new int[][] {{1, 6}}), equalTo(0));
    }
}
