package g0701_0800.s0741_cherry_pickup;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void cherryPickup() {
        assertThat(
                new Solution().cherryPickup(new int[][] {{0, 1, -1}, {1, 0, -1}, {1, 1, 1}}),
                equalTo(5));
    }

    @Test
    void cherryPickup2() {
        assertThat(
                new Solution().cherryPickup(new int[][] {{1, 1, -1}, {1, -1, 1}, {-1, 1, 1}}),
                equalTo(0));
    }
}
