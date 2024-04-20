package g0301_0400.s0335_self_crossing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isSelfCrossing() {
        assertThat(new Solution().isSelfCrossing(new int[] {2, 1, 1, 2}), equalTo(true));
    }

    @Test
    void isSelfCrossing2() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 2, 3, 4}), equalTo(false));
    }

    @Test
    void isSelfCrossing3() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 1, 1, 1}), equalTo(true));
    }

    @Test
    void isSelfCrossing4() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 1, 2, 1, 1}), equalTo(true));
    }

    @Test
    void isSelfCrossing5() {
        assertThat(new Solution().isSelfCrossing(new int[] {4, 2, 1, 4}), equalTo(true));
    }

    @Test
    void isSelfCrossing6() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 1, 1}), equalTo(false));
    }
}
