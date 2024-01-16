package g2001_2100.s2001_number_of_pairs_of_interchangeable_rectangles;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void interchangeableRectangles() {
        assertThat(
                new Solution()
                        .interchangeableRectangles(
                                new int[][] {{4, 8}, {3, 6}, {10, 20}, {15, 30}}),
                equalTo(6L));
    }

    @Test
    void interchangeableRectangles2() {
        assertThat(
                new Solution().interchangeableRectangles(new int[][] {{4, 5}, {7, 8}}),
                equalTo(0L));
    }
}
