package g2101_2200.s2146_k_highest_ranked_items_within_a_price_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void highestRankedKItems() {
        assertThat(
                new Solution()
                        .highestRankedKItems(
                                new int[][] {{1, 2, 0, 1}, {1, 3, 0, 1}, {0, 2, 5, 1}},
                                new int[] {2, 5},
                                new int[] {0, 0},
                                3),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(0, 1), Arrays.asList(1, 1), Arrays.asList(2, 1))));
    }

    @Test
    void highestRankedKItems2() {
        assertThat(
                new Solution()
                        .highestRankedKItems(
                                new int[][] {{1, 2, 0, 1}, {1, 3, 3, 1}, {0, 2, 5, 1}},
                                new int[] {2, 3},
                                new int[] {2, 3},
                                2),
                equalTo(Arrays.asList(Arrays.asList(2, 1), Arrays.asList(1, 2))));
    }

    @Test
    void highestRankedKItems3() {
        assertThat(
                new Solution()
                        .highestRankedKItems(
                                new int[][] {{1, 1, 1}, {0, 0, 1}, {2, 3, 4}},
                                new int[] {2, 3},
                                new int[] {0, 0},
                                3),
                equalTo(Arrays.asList(Arrays.asList(2, 1), Arrays.asList(2, 0))));
    }
}
