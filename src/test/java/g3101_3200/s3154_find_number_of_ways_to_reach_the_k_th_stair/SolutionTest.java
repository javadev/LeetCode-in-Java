package g3101_3200.s3154_find_number_of_ways_to_reach_the_k_th_stair;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void waysToReachStair() {
        assertThat(new Solution().waysToReachStair(0), equalTo(2));
    }

    @Test
    void waysToReachStair2() {
        assertThat(new Solution().waysToReachStair(1), equalTo(4));
    }
}
