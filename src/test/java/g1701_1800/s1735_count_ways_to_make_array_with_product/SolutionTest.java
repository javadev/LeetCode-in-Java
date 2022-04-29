package g1701_1800.s1735_count_ways_to_make_array_with_product;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void waysToFillArray() {
        assertThat(
                new Solution().waysToFillArray(new int[][] {{2, 6}, {5, 1}, {73, 660}}),
                equalTo(new int[] {4, 1, 50734910}));
    }

    @Test
    void waysToFillArray2() {
        assertThat(
                new Solution()
                        .waysToFillArray(new int[][] {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}}),
                equalTo(new int[] {1, 2, 3, 10, 5}));
    }
}
