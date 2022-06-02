package g2101_2200.s2125_number_of_laser_beams_in_a_bank;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfBeams() {
        assertThat(
                new Solution().numberOfBeams(new String[] {"011001", "000000", "010100", "001000"}),
                equalTo(8));
    }

    @Test
    void numberOfBeams2() {
        assertThat(new Solution().numberOfBeams(new String[] {"000", "111", "000"}), equalTo(0));
    }
}
