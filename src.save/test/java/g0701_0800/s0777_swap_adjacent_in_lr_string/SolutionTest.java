package g0701_0800.s0777_swap_adjacent_in_lr_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canTransform() {
        assertThat(new Solution().canTransform("RXXLRXRXL", "XRLXXRRLX"), equalTo(true));
    }

    @Test
    void canTransform2() {
        assertThat(new Solution().canTransform("X", "L"), equalTo(false));
    }
}
