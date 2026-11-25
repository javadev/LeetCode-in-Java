package g4001_4100.s4026_maximum_gap_between_stations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumGap() {
        assertThat(new Solution().maximumGap("abc", "abc"), equalTo(1));
    }

    @Test
    void maximumGap2() {
        assertThat(new Solution().maximumGap("abc", "axbyc"), equalTo(2));
    }

    @Test
    void maximumGap3() {
        assertThat(new Solution().maximumGap("a", "anything"), equalTo(0));
    }
}
