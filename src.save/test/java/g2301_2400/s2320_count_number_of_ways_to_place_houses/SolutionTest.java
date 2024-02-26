package g2301_2400.s2320_count_number_of_ways_to_place_houses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countHousePlacements() {
        assertThat(new Solution().countHousePlacements(1), equalTo(4));
    }

    @Test
    void countHousePlacements2() {
        assertThat(new Solution().countHousePlacements(2), equalTo(9));
    }
}
