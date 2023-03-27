package g2101_2200.s2103_rings_and_rods;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPoints() {
        assertThat(new Solution().countPoints("B0B6G0R6R0R6G9"), equalTo(1));
    }

    @Test
    void countPoints2() {
        assertThat(new Solution().countPoints("B0R0G0R9R0B0G0"), equalTo(1));
    }

    @Test
    void countPoints3() {
        assertThat(new Solution().countPoints("G4"), equalTo(0));
    }
}
