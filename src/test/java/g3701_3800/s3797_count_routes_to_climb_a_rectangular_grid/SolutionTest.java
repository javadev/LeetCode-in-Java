package g3701_3800.s3797_count_routes_to_climb_a_rectangular_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfRoutes() {
        assertThat(new Solution().numberOfRoutes(new String[] {"..", "#."}, 1), equalTo(2));
    }

    @Test
    void numberOfRoutes2() {
        assertThat(new Solution().numberOfRoutes(new String[] {"..", "#."}, 2), equalTo(4));
    }

    @Test
    void numberOfRoutes3() {
        assertThat(new Solution().numberOfRoutes(new String[] {"#"}, 750), equalTo(0));
    }

    @Test
    void numberOfRoutes4() {
        assertThat(new Solution().numberOfRoutes(new String[] {".."}, 1), equalTo(4));
    }
}
