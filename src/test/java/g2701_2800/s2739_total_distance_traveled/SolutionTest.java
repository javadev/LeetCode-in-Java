package g2701_2800.s2739_total_distance_traveled;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distanceTraveled() {
        assertThat(new Solution().distanceTraveled(5, 10), equalTo(60));
    }

    @Test
    void distanceTraveled2() {
        assertThat(new Solution().distanceTraveled(1, 2), equalTo(10));
    }
}
