package g0501_0600.s0514_freedom_trail;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findRotateSteps() {
        assertThat(new Solution().findRotateSteps("godding", "gd"), equalTo(4));
    }

    @Test
    void findRotateSteps2() {
        assertThat(new Solution().findRotateSteps("godding", "godding"), equalTo(13));
    }
}
