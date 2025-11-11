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

    @Test
    void maximumTime4() {
        assertThat(new Solution().maximumTime("?4:00"), equalTo("14:00"));
    }

    @Test
    void maximumTime5() {
        assertThat(new Solution().maximumTime("??:??"), equalTo("23:59"));
    }

    @Test
    void maximumTime6() {
        assertThat(new Solution().maximumTime("?3:15"), equalTo("23:15"));
    }

    @Test
    void maximumTime7() {
        assertThat(new Solution().maximumTime("2?:45"), equalTo("23:45"));
    }

    @Test
    void maximumTime8() {
        assertThat(new Solution().maximumTime("1?:??"), equalTo("19:59"));
    }

    @Test
    void maximumTime9() {
        assertThat(new Solution().maximumTime("10:?7"), equalTo("10:57"));
    }

    @Test
    void maximumTime10() {
        assertThat(new Solution().maximumTime("22:4?"), equalTo("22:49"));
    }
}
