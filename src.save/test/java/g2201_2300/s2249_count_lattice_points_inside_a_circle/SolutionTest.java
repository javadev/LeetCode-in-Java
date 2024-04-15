package g2201_2300.s2249_count_lattice_points_inside_a_circle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countLatticePoints() {
        assertThat(new Solution().countLatticePoints(new int[][] {{2, 2, 1}}), equalTo(5));
    }

    @Test
    void countLatticePoints2() {
        assertThat(
                new Solution().countLatticePoints(new int[][] {{2, 2, 2}, {3, 4, 1}}), equalTo(16));
    }
}
