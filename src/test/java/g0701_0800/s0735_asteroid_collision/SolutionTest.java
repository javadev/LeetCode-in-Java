package g0701_0800.s0735_asteroid_collision;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void asteroidCollision() {
        assertThat(
                new Solution().asteroidCollision(new int[] {5, 10, -5}),
                equalTo(new int[] {5, 10}));
    }

    @Test
    void asteroidCollision2() {
        assertThat(new Solution().asteroidCollision(new int[] {8, -8}), equalTo(new int[] {}));
    }

    @Test
    void asteroidCollision3() {
        assertThat(
                new Solution().asteroidCollision(new int[] {10, 2, -5}), equalTo(new int[] {10}));
    }
}
