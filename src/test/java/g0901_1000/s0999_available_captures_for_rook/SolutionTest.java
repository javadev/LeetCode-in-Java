package g0901_1000.s0999_available_captures_for_rook;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numRookCaptures() {
        assertThat(
                new Solution()
                        .numRookCaptures(
                                new char[][] {
                                    {'.', '.', '.', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'p', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                                    {'.', '.', '.', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'p', '.', '.', '.', '.'},
                                    {'.', '.', '.', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', '.', '.', '.', '.', '.'}
                                }),
                equalTo(3));
    }

    @Test
    void numRookCaptures2() {
        assertThat(
                new Solution()
                        .numRookCaptures(
                                new char[][] {
                                    {'.', '.', '.', '.', '.', '.', '.', '.'},
                                    {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                                    {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                                    {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
                                    {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                                    {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                                    {'.', '.', '.', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', '.', '.', '.', '.', '.'}
                                }),
                equalTo(0));
    }

    @Test
    void numRookCaptures3() {
        assertThat(
                new Solution()
                        .numRookCaptures(
                                new char[][] {
                                    {'.', '.', '.', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'p', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'p', '.', '.', '.', '.'},
                                    {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                                    {'.', '.', '.', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'B', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'p', '.', '.', '.', '.'},
                                    {'.', '.', '.', '.', '.', '.', '.', '.'}
                                }),
                equalTo(3));
    }
}
