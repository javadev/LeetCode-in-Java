package g1701_1800.s1736_latest_time_by_replacing_hidden_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumTime() {
        assertThat(new Solution().maximumTime("2?:?0"), equalTo("23:50"));
    }

    @Test
    void maximumTime2() {
        assertThat(new Solution().maximumTime("0?:3?"), equalTo("09:39"));
    }

    @Test
    void maximumTime3() {
        assertThat(new Solution().maximumTime("1?:22"), equalTo("19:22"));
    }
}
