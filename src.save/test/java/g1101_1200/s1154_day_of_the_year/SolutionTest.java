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
}
