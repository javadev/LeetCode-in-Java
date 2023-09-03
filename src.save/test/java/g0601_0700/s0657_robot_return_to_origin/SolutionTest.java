package g0601_0700.s0657_robot_return_to_origin;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void judgeCircle() {
        assertThat(new Solution().judgeCircle("UD"), equalTo(true));
    }

    @Test
    void judgeCircle2() {
        assertThat(new Solution().judgeCircle("LL"), equalTo(false));
    }
}
