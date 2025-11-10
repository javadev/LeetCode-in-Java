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

    @Test
    void isSelfCrossing7() {
        assertThat(new Solution().isSelfCrossing(new int[] {3, 3, 3, 2, 1, 1}), equalTo(false));
    }

    @Test
    void isSelfCrossing8() {
        assertThat(new Solution().isSelfCrossing(new int[] {2, 3, 4, 5, 6, 7}), equalTo(false));
    }

    @Test
    void isSelfCrossing9() {
        assertThat(new Solution().isSelfCrossing(new int[] {2, 2, 3, 2, 2}), equalTo(true));
    }

    @Test
    void isSelfCrossing10() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 1, 2, 1, 2, 1}), equalTo(true));
    }

    @Test
    void isSelfCrossing11() {
        assertThat(new Solution().isSelfCrossing(new int[] {10, 20, 30, 40, 50}), equalTo(false));
    }

    @Test
    void isSelfCrossing12() {
        assertThat(new Solution().isSelfCrossing(new int[] {3, 3, 4, 2, 2}), equalTo(false));
    }

    @Test
    void isSelfCrossing13() {
        assertThat(new Solution().isSelfCrossing(new int[] {2, 1, 2, 1}), equalTo(true));
    }

    @Test
    void isSelfCrossing14() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 2, 3, 4, 5, 6, 7, 8}), equalTo(false));
    }

    @Test
    void isSelfCrossing15() {
        assertThat(new Solution().isSelfCrossing(new int[] {2, 2, 2, 2, 2, 2}), equalTo(true));
    }

    @Test
    void isSelfCrossing16() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 1, 2, 1, 1}), equalTo(true));
    }

    @Test
    void isSelfCrossing17() {
        assertThat(new Solution().isSelfCrossing(new int[] {1, 1, 2, 2, 1, 1}), equalTo(true));
    }
}
