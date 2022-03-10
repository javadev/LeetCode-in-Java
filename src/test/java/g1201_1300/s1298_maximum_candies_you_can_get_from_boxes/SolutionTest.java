package g1201_1300.s1298_maximum_candies_you_can_get_from_boxes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxCandies() {
        assertThat(
                new Solution()
                        .maxCandies(
                                new int[] {1, 0, 1, 0},
                                new int[] {7, 5, 4, 100},
                                new int[][] {{}, {}, {1}, {}},
                                new int[][] {{1, 2}, {3}, {}, {}},
                                new int[] {0}),
                equalTo(16));
    }

    @Test
    void maxCandies2() {
        assertThat(
                new Solution()
                        .maxCandies(
                                new int[] {1, 0, 0, 0, 0, 0},
                                new int[] {1, 1, 1, 1, 1, 1},
                                new int[][] {{1, 2, 3, 4, 5}, {}, {}, {}, {}, {}},
                                new int[][] {{1, 2, 3, 4, 5}, {}, {}, {}, {}, {}},
                                new int[] {0}),
                equalTo(6));
    }
}
