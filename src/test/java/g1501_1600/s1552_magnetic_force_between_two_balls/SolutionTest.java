package g1501_1600.s1552_magnetic_force_between_two_balls;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDistance() {
        assertThat(new Solution().maxDistance(new int[] {1, 2, 3, 4, 7}, 3), equalTo(3));
    }

    @Test
    void maxDistance2() {
        assertThat(
                new Solution().maxDistance(new int[] {5, 4, 3, 2, 1, 1000000000}, 2),
                equalTo(999999999));
    }
}
