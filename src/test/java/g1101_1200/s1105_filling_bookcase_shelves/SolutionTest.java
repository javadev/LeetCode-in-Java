package g1101_1200.s1105_filling_bookcase_shelves;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minHeightShelves() {
        assertThat(
                new Solution()
                        .minHeightShelves(
                                new int[][] {
                                    {1, 1}, {2, 3}, {2, 3}, {1, 1}, {1, 1}, {1, 1}, {1, 2}
                                },
                                4),
                equalTo(6));
    }

    @Test
    void minHeightShelves2() {
        assertThat(
                new Solution().minHeightShelves(new int[][] {{1, 3}, {2, 4}, {3, 2}}, 66),
                equalTo(4));
    }
}
