package g1001_1100.s1041_robot_bounded_in_circle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isRobotBounded() {
        assertThat(new Solution().isRobotBounded("GGLLGG"), equalTo(true));
    }

    @Test
    void isRobotBounded2() {
        assertThat(new Solution().isRobotBounded("GG"), equalTo(false));
    }

    @Test
    void isRobotBounded3() {
        assertThat(new Solution().isRobotBounded("GL"), equalTo(true));
    }
}
