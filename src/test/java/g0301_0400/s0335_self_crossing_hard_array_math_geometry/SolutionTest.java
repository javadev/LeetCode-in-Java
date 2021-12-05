package g0301_0400.s0335_self_crossing_hard_array_math_geometry;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isSelfCrossing() {
        assertThat(new Solution().isSelfCrossing(new int[] {2, 1, 1, 2}), equalTo(true));
    }

    @Test
    public void isSelfCrossing2() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 2, 3, 4}), equalTo(false));
    }

    @Test
    public void isSelfCrossing3() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 1, 1, 1}), equalTo(true));
    }

    @Test
    public void isSelfCrossing4() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 1, 2, 1, 1}), equalTo(true));
    }

    @Test
    public void isSelfCrossing5() {
        assertThat(new Solution().isSelfCrossing(new int[] {4, 2, 1, 4}), equalTo(true));
    }

    @Test
    public void isSelfCrossing6() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 1, 1}), equalTo(false));
    }
}
