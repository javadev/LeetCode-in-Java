package g1501_1600.s1523_count_odd_numbers_in_an_interval_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOdds() {
        assertThat(new Solution().countOdds(3, 7), equalTo(3));
    }

    @Test
    void countOdds2() {
        assertThat(new Solution().countOdds(8, 10), equalTo(1));
    }
}
