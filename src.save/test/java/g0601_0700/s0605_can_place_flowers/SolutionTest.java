package g0601_0700.s0605_can_place_flowers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canPlaceFlowers() {
        assertThat(new Solution().canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1), equalTo(true));
    }

    @Test
    void canPlaceFlowers2() {
        assertThat(new Solution().canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2), equalTo(false));
    }
}
