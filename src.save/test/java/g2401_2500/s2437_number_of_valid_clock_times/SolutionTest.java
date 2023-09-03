package g2401_2500.s2437_number_of_valid_clock_times;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countTime() {
        assertThat(new Solution().countTime("?5:00"), equalTo(2));
    }

    @Test
    void countTime2() {
        assertThat(new Solution().countTime("0?:0?"), equalTo(100));
    }

    @Test
    void countTime3() {
        assertThat(new Solution().countTime("??:??"), equalTo(1440));
    }
}
