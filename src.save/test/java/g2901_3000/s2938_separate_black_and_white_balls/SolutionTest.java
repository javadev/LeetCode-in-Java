package g2901_3000.s2938_separate_black_and_white_balls;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSteps() {
        assertThat(new Solution().minimumSteps("101"), equalTo(1L));
    }

    @Test
    void minimumSteps2() {
        assertThat(new Solution().minimumSteps("100"), equalTo(2L));
    }

    @Test
    void minimumSteps3() {
        assertThat(new Solution().minimumSteps("0111"), equalTo(0L));
    }
}
