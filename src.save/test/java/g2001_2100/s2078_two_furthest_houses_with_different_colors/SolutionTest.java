package g2001_2100.s2078_two_furthest_houses_with_different_colors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDistance() {
        assertThat(new Solution().maxDistance(new int[] {1, 1, 1, 6, 1, 1, 1}), equalTo(3));
    }

    @Test
    void maxDistance2() {
        assertThat(new Solution().maxDistance(new int[] {1, 8, 3, 8, 3}), equalTo(4));
    }

    @Test
    void maxDistance3() {
        assertThat(new Solution().maxDistance(new int[] {0, 1}), equalTo(1));
    }
}
