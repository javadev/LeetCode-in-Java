package g0401_0500.s0447_number_of_boomerangs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfBoomerangs() {
        assertThat(
                new Solution().numberOfBoomerangs(new int[][] {{0, 0}, {1, 0}, {2, 0}}),
                equalTo(2));
    }

    @Test
    void numberOfBoomerangs2() {
        assertThat(
                new Solution().numberOfBoomerangs(new int[][] {{1, 1}, {2, 2}, {3, 3}}),
                equalTo(2));
    }

    @Test
    void numberOfBoomerangs3() {
        assertThat(new Solution().numberOfBoomerangs(new int[][] {{1, 1}}), equalTo(0));
    }
}
