package g1501_1600.s1575_count_all_possible_routes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countRoutes() {
        assertThat(new Solution().countRoutes(new int[] {2, 3, 6, 8, 4}, 1, 3, 5), equalTo(4));
    }

    @Test
    void countRoutes2() {
        assertThat(new Solution().countRoutes(new int[] {4, 3, 1}, 1, 0, 6), equalTo(5));
    }

    @Test
    void countRoutes3() {
        assertThat(new Solution().countRoutes(new int[] {5, 2, 1}, 0, 2, 3), equalTo(0));
    }
}
