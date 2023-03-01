package g2401_2500.s2409_count_days_spent_together;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countDaysTogether() {
        assertThat(
                new Solution().countDaysTogether("08-15", "08-18", "08-16", "08-19"), equalTo(3));
    }

    @Test
    void countDaysTogether2() {
        assertThat(
                new Solution().countDaysTogether("10-01", "10-31", "11-01", "12-31"), equalTo(0));
    }

    @Test
    void countDaysTogether3() {
        assertThat(
                new Solution().countDaysTogether("09-01", "10-19", "06-19", "10-20"), equalTo(49));
    }

    @Test
    void countDaysTogether4() {
        assertThat(
                new Solution().countDaysTogether("08-06", "12-08", "02-04", "09-01"), equalTo(27));
    }

    @Test
    void countDaysTogether5() {
        assertThat(
                new Solution().countDaysTogether("03-05", "07-14", "04-14", "09-21"), equalTo(92));
    }
}
