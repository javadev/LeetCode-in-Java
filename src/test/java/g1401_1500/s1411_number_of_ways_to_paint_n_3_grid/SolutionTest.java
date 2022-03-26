package g1401_1500.s1411_number_of_ways_to_paint_n_3_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfWays() {
        assertThat(new Solution().numOfWays(1), equalTo(12));
    }

    @Test
    void numOfWays2() {
        assertThat(new Solution().numOfWays(5000), equalTo(30228214));
    }
}
