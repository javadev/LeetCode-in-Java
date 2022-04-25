package g1701_1800.s1725_number_of_rectangles_that_can_form_the_largest_square;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodRectangles() {
        assertThat(
                new Solution().countGoodRectangles(new int[][] {{5, 8}, {3, 9}, {5, 12}, {16, 5}}),
                equalTo(3));
    }

    @Test
    void countGoodRectangles2() {
        assertThat(
                new Solution().countGoodRectangles(new int[][] {{2, 3}, {3, 7}, {4, 3}, {3, 7}}),
                equalTo(3));
    }
}
