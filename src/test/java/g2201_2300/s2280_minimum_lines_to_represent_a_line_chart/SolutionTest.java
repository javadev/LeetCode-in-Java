package g2201_2300.s2280_minimum_lines_to_represent_a_line_chart;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumLines() {
        assertThat(
                new Solution()
                        .minimumLines(
                                new int[][] {
                                    {1, 7}, {2, 6}, {3, 5}, {4, 4}, {5, 4}, {6, 3}, {7, 2}, {8, 1}
                                }),
                equalTo(3));
    }

    @Test
    void minimumLines2() {
        assertThat(
                new Solution().minimumLines(new int[][] {{3, 4}, {1, 2}, {7, 8}, {2, 3}}),
                equalTo(1));
    }

    @Test
    void minimumLines3() {
        assertThat(new Solution().minimumLines(new int[][] {{3, 4}}), equalTo(0));
    }
}
