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

    @Test
    void dayOfTheWeek4() {
        assertThat(new Solution().dayOfTheWeek(1, 1, 1971), equalTo("Friday"));
    }

    @Test
    void dayOfTheWeek5() {
        assertThat(new Solution().dayOfTheWeek(29, 2, 2020), equalTo("Saturday"));
    }

    @Test
    void dayOfTheWeek6() {
        assertThat(new Solution().dayOfTheWeek(1, 3, 2020), equalTo("Sunday"));
    }

    @Test
    void dayOfTheWeek7() {
        assertThat(new Solution().dayOfTheWeek(28, 2, 2019), equalTo("Thursday"));
    }

    @Test
    void dayOfTheWeek8() {
        assertThat(new Solution().dayOfTheWeek(31, 12, 1999), equalTo("Friday"));
    }

    @Test
    void dayOfTheWeek9() {
        assertThat(new Solution().dayOfTheWeek(1, 1, 2001), equalTo("Monday"));
    }

    @Test
    void dayOfTheWeek10() {
        assertThat(new Solution().dayOfTheWeek(1, 1, 2000), equalTo("Saturday"));
    }

    @Test
    void dayOfTheWeek11() {
        assertThat(new Solution().dayOfTheWeek(1, 3, 1900), equalTo("Monday"));
    }

    @Test
    void dayOfTheWeek12() {
        assertThat(new Solution().dayOfTheWeek(15, 6, 2024), equalTo("Saturday"));
    }

    @Test
    void dayOfTheWeek13() {
        assertThat(new Solution().dayOfTheWeek(30, 11, 1985), equalTo("Saturday"));
    }

    @Test
    void dayOfTheWeek14() {
        assertThat(new Solution().dayOfTheWeek(20, 4, 1975), equalTo("Sunday"));
    }

    @Test
    void dayOfTheWeek15() {
        assertThat(new Solution().dayOfTheWeek(5, 1, 1971), equalTo("Tuesday"));
    }

    @Test
    void dayOfTheWeek16() {
        assertThat(new Solution().dayOfTheWeek(6, 1, 1971), equalTo("Wednesday"));
    }
}
