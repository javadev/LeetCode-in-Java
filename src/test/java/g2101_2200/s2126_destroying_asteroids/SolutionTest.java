package g2101_2200.s2126_destroying_asteroids;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void asteroidsDestroyed() {
        assertThat(
                new Solution().asteroidsDestroyed(10, new int[] {3, 9, 19, 5, 21}), equalTo(true));
    }

    @Test
    void asteroidsDestroyed2() {
        assertThat(new Solution().asteroidsDestroyed(5, new int[] {4, 9, 23, 4}), equalTo(false));
    }
}
