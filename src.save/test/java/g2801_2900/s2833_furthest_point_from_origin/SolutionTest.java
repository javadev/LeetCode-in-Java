package g2801_2900.s2833_furthest_point_from_origin;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void furthestDistanceFromOrigin() {
        assertThat(new Solution().furthestDistanceFromOrigin("L_RL__R"), equalTo(3));
    }

    @Test
    void furthestDistanceFromOrigin2() {
        assertThat(new Solution().furthestDistanceFromOrigin("_R__LL_"), equalTo(5));
    }

    @Test
    void furthestDistanceFromOrigin3() {
        assertThat(new Solution().furthestDistanceFromOrigin("_______"), equalTo(7));
    }
}
