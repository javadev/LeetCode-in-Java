package g2501_2600.s2511_maximum_enemy_forts_that_can_be_captured;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void captureForts() {
        assertThat(new Solution().captureForts(new int[] {1, 0, 0, -1, 0, 0, 0, 0, 1}), equalTo(4));
    }

    @Test
    void captureForts2() {
        assertThat(new Solution().captureForts(new int[] {0, 0, 1, -1}), equalTo(0));
    }
}
