package g2201_2300.s2222_number_of_ways_to_select_buildings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfWays() {
        assertThat(new Solution().numberOfWays("001101"), equalTo(6L));
    }

    @Test
    void numberOfWays2() {
        assertThat(new Solution().numberOfWays("11100"), equalTo(0L));
    }
}
