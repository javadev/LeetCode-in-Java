package g1501_1600.s1591_strange_printer_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPrintable() {
        assertThat(
                new Solution()
                        .isPrintable(
                                new int[][] {
                                    {1, 1, 1, 1}, {1, 2, 2, 1}, {1, 2, 2, 1}, {1, 1, 1, 1}
                                }),
                equalTo(true));
    }

    @Test
    void isPrintable2() {
        assertThat(
                new Solution()
                        .isPrintable(
                                new int[][] {
                                    {1, 1, 1, 1}, {1, 1, 3, 3}, {1, 1, 3, 4}, {5, 5, 1, 4}
                                }),
                equalTo(true));
    }

    @Test
    void isPrintable3() {
        assertThat(
                new Solution().isPrintable(new int[][] {{1, 2, 1}, {2, 1, 2}, {1, 2, 1}}),
                equalTo(false));
    }
}
