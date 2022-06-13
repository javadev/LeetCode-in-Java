package g2201_2300.s2250_count_number_of_rectangles_containing_each_point;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countRectangles() {
        assertThat(
                new Solution()
                        .countRectangles(
                                new int[][] {{1, 2}, {2, 3}, {2, 5}}, new int[][] {{2, 1}, {1, 4}}),
                equalTo(new int[] {2, 1}));
    }

    @Test
    void countRectangles2() {
        assertThat(
                new Solution()
                        .countRectangles(
                                new int[][] {{1, 1}, {2, 2}, {3, 3}}, new int[][] {{1, 3}, {1, 1}}),
                equalTo(new int[] {1, 3}));
    }
}
