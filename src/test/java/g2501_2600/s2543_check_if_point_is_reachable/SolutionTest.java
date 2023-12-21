package g2501_2600.s2543_check_if_point_is_reachable;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isReachable() {
        assertThat(new Solution().isReachable(6, 9), equalTo(false));
    }

    @Test
    void isReachable2() {
        assertThat(new Solution().isReachable(4, 7), equalTo(true));
    }
}
