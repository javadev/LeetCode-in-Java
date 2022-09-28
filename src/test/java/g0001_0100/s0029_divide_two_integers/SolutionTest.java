package g0001_0100.s0029_divide_two_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void divide() {
        assertThat(new Solution().divide(10, 3), equalTo(3));
    }

    @Test
    void divide2() {
        assertThat(new Solution().divide(7, -3), equalTo(-2));
    }
}
