package g1101_1200.s1185_day_of_the_week;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void dayOfTheWeek() {
        assertThat(new Solution().dayOfTheWeek(31, 8, 2019), equalTo("Saturday"));
    }

    @Test
    void dayOfTheWeek2() {
        assertThat(new Solution().dayOfTheWeek(18, 7, 1999), equalTo("Sunday"));
    }

    @Test
    void dayOfTheWeek3() {
        assertThat(new Solution().dayOfTheWeek(15, 8, 1993), equalTo("Sunday"));
    }
}
