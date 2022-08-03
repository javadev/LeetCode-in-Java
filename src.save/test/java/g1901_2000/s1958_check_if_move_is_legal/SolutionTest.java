package g1901_2000.s1958_check_if_move_is_legal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkMove() {
        assertThat(
                new Solution()
                        .checkMove(
                                new char[][] {
                                    {'.', '.', '.', 'B', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'W', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'W', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'W', '.', '.', '.', '.'},
                                    {'W', 'B', 'B', '.', 'W', 'W', 'W', 'B'},
                                    {'.', '.', '.', 'B', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'B', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'W', '.', '.', '.', '.'}
                                },
                                4,
                                3,
                                'B'),
                equalTo(true));
    }

    @Test
    void checkMove2() {
        assertThat(
                new Solution()
                        .checkMove(
                                new char[][] {
                                    {'.', '.', '.', '.', '.', '.', '.', '.'},
                                    {'.', 'B', '.', '.', 'W', '.', '.', '.'},
                                    {'.', '.', 'W', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', 'W', 'B', '.', '.', '.'},
                                    {'.', '.', '.', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', '.', 'B', 'W', '.', '.'},
                                    {'.', '.', '.', '.', '.', '.', 'W', '.'},
                                    {'.', '.', '.', '.', '.', '.', '.', 'B'}
                                },
                                4,
                                4,
                                'W'),
                equalTo(false));
    }
}
