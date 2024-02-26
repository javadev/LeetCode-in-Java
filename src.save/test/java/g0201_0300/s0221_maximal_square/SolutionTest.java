package g0201_0300.s0221_maximal_square;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximalSquare() {
        char[][] input = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        assertThat(new Solution().maximalSquare(input), equalTo(4));
    }

    @Test
    void maximalSquare2() {
        char[][] input = {{'0', '1'}, {'1', '0'}};
        assertThat(new Solution().maximalSquare(input), equalTo(1));
    }

    @Test
    void maximalSquare3() {
        char[][] input = {{'0'}};
        assertThat(new Solution().maximalSquare(input), equalTo(0));
    }
}
