package g2201_2300.s2240_number_of_ways_to_buy_pens_and_pencils;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void waysToBuyPensPencils() {
        assertThat(new Solution().waysToBuyPensPencils(20, 10, 5), equalTo(9L));
    }

    @Test
    void waysToBuyPensPencils2() {
        assertThat(new Solution().waysToBuyPensPencils(5, 10, 10), equalTo(1L));
    }
}
