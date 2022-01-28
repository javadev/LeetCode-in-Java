package g0701_0800.s0780_reaching_points;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reachingPoints() {
        assertThat(new Solution().reachingPoints(1, 1, 3, 5), equalTo(true));
    }

    @Test
    void reachingPoints2() {
        assertThat(new Solution().reachingPoints(1, 1, 2, 2), equalTo(false));
    }

    @Test
    void reachingPoints3() {
        assertThat(new Solution().reachingPoints(1, 1, 1, 1), equalTo(true));
    }
}
