package g2701_2800.s2731_movement_of_robots;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void sumDistance() {
        assertThat(new Solution().sumDistance(new int[] {-2, 0, 2}, "RLL", 3), equalTo(8));
    }

    @Test
    void sumDistance2() {
        assertThat(new Solution().sumDistance(new int[] {1, 0}, "RL", 2), equalTo(5));
    }
}
