package g2301_2400.s2380_time_needed_to_rearrange_a_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void secondsToRemoveOccurrences() {
        assertThat(new Solution().secondsToRemoveOccurrences("0110101"), equalTo(4));
    }

    @Test
    void secondsToRemoveOccurrences2() {
        assertThat(new Solution().secondsToRemoveOccurrences("11100"), equalTo(0));
    }
}
