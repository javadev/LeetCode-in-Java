package g1301_1400.s1360_number_of_days_between_two_dates;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void daysBetweenDates() {
        assertThat(new Solution().daysBetweenDates("2019-06-29", "2019-06-30"), equalTo(1));
    }

    @Test
    void daysBetweenDates2() {
        assertThat(new Solution().daysBetweenDates("2020-01-15", "2019-12-31"), equalTo(15));
    }
}
