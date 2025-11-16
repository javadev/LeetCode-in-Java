package g1001_1100.s1036_escape_a_large_maze;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isEscapePossible() {
        assertThat(
                new Solution()
                        .isEscapePossible(
                                new int[][] {{0, 1}, {1, 0}}, new int[] {0, 0}, new int[] {0, 2}),
                equalTo(false));
    }

    @Test
    void isEscapePossible2() {
        assertThat(
                new Solution()
                        .isEscapePossible(
                                new int[][] {}, new int[] {0, 0}, new int[] {999999, 999999}),
                equalTo(true));
    }

    @Test
    void isEscapePossible3() {
        assertThat(
                new Solution()
                        .isEscapePossible(new int[][] {{1, 1}}, new int[] {0, 0}, new int[] {1, 1}),
                equalTo(true));
    }

    @Test
    void isEscapePossible4() {
        assertThat(
                new Solution()
                        .isEscapePossible(
                                new int[][] {{10, 10}}, new int[] {0, 0}, new int[] {0, 1}),
                equalTo(true));
    }

    @Test
    void isEscapePossible5() {
        assertThat(
                new Solution()
                        .isEscapePossible(
                                new int[][] {{0, 2}, {1, 2}, {2, 2}},
                                new int[] {0, 0},
                                new int[] {3, 3}),
                equalTo(true));
    }

    @Test
    void isEscapePossible6() {
        assertThat(
                new Solution()
                        .isEscapePossible(
                                new int[][] {{0, 1}, {0, 2}, {1, 0}, {2, 0}},
                                new int[] {0, 0},
                                new int[] {3, 3}),
                equalTo(false));
    }

    @Test
    void isEscapePossible7() {
        assertThat(
                new Solution()
                        .isEscapePossible(
                                new int[][] {{999998, 999999}, {999999, 999998}},
                                new int[] {999999, 999999},
                                new int[] {0, 0}),
                equalTo(false));
    }

    @Test
    void isEscapePossible8() {
        assertThat(
                new Solution()
                        .isEscapePossible(
                                new int[][] {{5, 5}, {5, 6}, {6, 5}},
                                new int[] {5, 7},
                                new int[] {6, 6}),
                equalTo(true));
    }

    @Test
    void isEscapePossible9() {
        assertThat(
                new Solution()
                        .isEscapePossible(new int[][] {{1, 2}}, new int[] {2, 2}, new int[] {2, 2}),
                equalTo(true));
    }

    @Test
    void isEscapePossible10() {
        assertThat(
                new Solution().isEscapePossible(new int[][] {}, new int[] {0, 0}, new int[] {0, 1}),
                equalTo(true));
    }

    @Test
    void isEscapePossible11() {
        assertThat(
                new Solution()
                        .isEscapePossible(new int[][] {{2, 2}}, new int[] {2, 1}, new int[] {2, 2}),
                equalTo(true));
    }
}
