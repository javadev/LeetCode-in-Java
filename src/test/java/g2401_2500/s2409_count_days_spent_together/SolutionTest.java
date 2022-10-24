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
}
