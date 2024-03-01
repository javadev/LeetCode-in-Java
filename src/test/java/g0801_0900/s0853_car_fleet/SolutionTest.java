package g0801_0900.s0853_car_fleet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void carFleet() {
        assertThat(
                new Solution().carFleet(12, new int[] {10, 8, 0, 5, 3}, new int[] {2, 4, 1, 1, 3}),
                equalTo(3));
    }

    @Test
    void carFleet2() {
        assertThat(new Solution().carFleet(10, new int[] {3}, new int[] {3}), equalTo(1));
    }

    @Test
    void carFleet3() {
        assertThat(
                new Solution().carFleet(100, new int[] {0, 2, 4}, new int[] {4, 2, 1}), equalTo(1));
    }
}
