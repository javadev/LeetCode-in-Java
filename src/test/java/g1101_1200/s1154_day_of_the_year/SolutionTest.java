package g1101_1200.s1154_day_of_the_year;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void dayOfYear() {
        assertThat(new Solution().dayOfYear("2019-01-09"), equalTo(9));
    }

    @Test
    void dayOfYear2() {
        assertThat(new Solution().dayOfYear("2019-02-10"), equalTo(41));
    }

    @Test
    void dayOfYear3() {
        assertThat(new Solution().dayOfYear("2020-02-01"), equalTo(32));
    }

    @Test
    void dayOfYear4() {
        assertThat(new Solution().dayOfYear("2020-03-01"), equalTo(61));
    }

    @Test
    void dayOfYear5() {
        assertThat(new Solution().dayOfYear("2019-02-28"), equalTo(59));
    }

    @Test
    void dayOfYear6() {
        assertThat(new Solution().dayOfYear("2020-02-29"), equalTo(60));
    }

    @Test
    void dayOfYear7() {
        assertThat(new Solution().dayOfYear("2019-12-31"), equalTo(365));
    }

    @Test
    void dayOfYear8() {
        assertThat(new Solution().dayOfYear("2020-12-31"), equalTo(366));
    }

    @Test
    void dayOfYear9() {
        assertThat(new Solution().dayOfYear("2021-01-01"), equalTo(1));
    }

    @Test
    void dayOfYear10() {
        assertThat(new Solution().dayOfYear("2021-07-04"), equalTo(185));
    }

    @Test
    void dayOfYear11() {
        assertThat(new Solution().dayOfYear("2000-02-29"), equalTo(60));
    }

    @Test
    void dayOfYear12() {
        assertThat(new Solution().dayOfYear("1900-03-01"), equalTo(60));
    }
}
