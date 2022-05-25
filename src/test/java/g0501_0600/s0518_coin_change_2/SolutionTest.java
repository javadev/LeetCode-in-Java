package g0501_0600.s0518_coin_change_2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void change() {
        assertThat(new Solution().change(5, new int[] {1, 2, 5}), equalTo(4));
    }

    @Test
    void change2() {
        assertThat(new Solution().change(3, new int[] {2}), equalTo(0));
    }

    @Test
    void change3() {
        assertThat(new Solution().change(10, new int[] {10}), equalTo(1));
    }
}
