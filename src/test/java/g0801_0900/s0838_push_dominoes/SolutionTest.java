package g0801_0900.s0838_push_dominoes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pushDominoes() {
        assertThat(new Solution().pushDominoes("RR.L"), equalTo("RR.L"));
    }

    @Test
    void pushDominoes2() {
        assertThat(new Solution().pushDominoes(".L.R...LR..L.."), equalTo("LL.RR.LLRRLL.."));
    }
}
