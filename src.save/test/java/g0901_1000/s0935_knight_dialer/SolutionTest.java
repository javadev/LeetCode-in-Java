package g0901_1000.s0935_knight_dialer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void knightDialer() {
        assertThat(new Solution().knightDialer(1), equalTo(10));
    }

    @Test
    void knightDialer2() {
        assertThat(new Solution().knightDialer(2), equalTo(20));
    }

    @Test
    void knightDialer3() {
        assertThat(new Solution().knightDialer(3131), equalTo(136006598));
    }
}
