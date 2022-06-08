package g2101_2200.s2132_stamping_the_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void possibleToStamp() {
        assertThat(
                new Solution()
                        .possibleToStamp(
                                new int[][] {
                                    {1, 0, 0, 0},
                                    {1, 0, 0, 0},
                                    {1, 0, 0, 0},
                                    {1, 0, 0, 0},
                                    {1, 0, 0, 0}
                                },
                                4,
                                3),
                equalTo(true));
    }

    @Test
    void possibleToStamp2() {
        assertThat(
                new Solution()
                        .possibleToStamp(
                                new int[][] {
                                    {1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}
                                },
                                2,
                                2),
                equalTo(false));
    }

    @Test
    void possibleToStamp3() {
        assertThat(
                new Solution()
                        .possibleToStamp(
                                new int[][] {
                                    {0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0},
                                    {0, 0, 1, 0, 0},
                                    {0, 0, 0, 0, 1},
                                    {0, 0, 0, 1, 1}
                                },
                                2,
                                2),
                equalTo(false));
    }

    @Test
    void possibleToStamp4() {
        assertThat(
                new Solution()
                        .possibleToStamp(
                                new int[][] {{0}, {0}, {0}, {0}, {1}, {1}, {0}, {0}, {1}}, 9, 1),
                equalTo(false));
    }

    @Test
    void possibleToStamp5() {
        assertThat(
                new Solution().possibleToStamp(new int[][] {{1}, {1}, {0}, {0}}, 3, 1),
                equalTo(false));
    }

    @Test
    void possibleToStamp6() {
        assertThat(
                new Solution().possibleToStamp(new int[][] {{0, 1}, {0, 0}}, 2, 2), equalTo(false));
    }

    @Test
    void possibleToStamp7() {
        assertThat(
                new Solution().possibleToStamp(new int[][] {{1, 1, 0, 0}}, 1, 3), equalTo(false));
    }
}
