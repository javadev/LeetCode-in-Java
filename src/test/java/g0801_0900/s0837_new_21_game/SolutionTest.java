package g0801_0900.s0837_new_21_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    int n = 100000;

    @Test
    void new21Game() {
        assertThat(
                (double) Math.round(new Solution().new21Game(10, 1, 10) * n) / n, equalTo(1.00000));
    }

    @Test
    void new21Game2() {
        assertThat((double) Math.round(new Solution().new21Game(6, 1, 10) * n) / n, equalTo(0.6));
    }

    @Test
    void new21Game3() {
        assertThat(
                (double) Math.round(new Solution().new21Game(21, 17, 10) * n) / n,
                equalTo(0.73278));
    }
}
