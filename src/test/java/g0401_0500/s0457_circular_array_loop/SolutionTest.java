package g0401_0500.s0457_circular_array_loop;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void circularArrayLoop() {
        assertThat(new Solution().circularArrayLoop(new int[] {2, -1, 1, 2, 2}), equalTo(true));
    }

    @Test
    void circularArrayLoop2() {
        assertThat(new Solution().circularArrayLoop(new int[] {-1, 2}), equalTo(false));
    }

    @Test
    void circularArrayLoop3() {
        assertThat(new Solution().circularArrayLoop(new int[] {-2, 1, -1, -2, -2}), equalTo(false));
    }
}
