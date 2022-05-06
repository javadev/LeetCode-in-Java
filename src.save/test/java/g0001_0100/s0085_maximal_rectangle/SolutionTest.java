package g0001_0100.s0085_maximal_rectangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximalRectangle() {
        char[][] array = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        assertThat(new Solution().maximalRectangle(array), equalTo(6));
    }

    @Test
    void maximalRectangle2() {
        char[][] array = {{'0'}};
        assertThat(new Solution().maximalRectangle(array), equalTo(0));
    }

    @Test
    void maximalRectangle3() {
        char[][] array = {{'1'}};
        assertThat(new Solution().maximalRectangle(array), equalTo(1));
    }
}
