package g2401_2500.s2498_frog_jump_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxJump() {
        assertThat(new Solution().maxJump(new int[] {0, 2, 5, 6, 7}), equalTo(5));
    }

    @Test
    void maxJump2() {
        assertThat(new Solution().maxJump(new int[] {0, 3, 9}), equalTo(9));
    }
}
