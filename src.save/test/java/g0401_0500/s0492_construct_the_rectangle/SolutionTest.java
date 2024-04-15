package g0401_0500.s0492_construct_the_rectangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constructRectangle() {
        assertThat(new Solution().constructRectangle(4), equalTo(new int[] {2, 2}));
    }

    @Test
    void constructRectangle2() {
        assertThat(new Solution().constructRectangle(37), equalTo(new int[] {37, 1}));
    }

    @Test
    void constructRectangle3() {
        assertThat(new Solution().constructRectangle(122122), equalTo(new int[] {427, 286}));
    }
}
