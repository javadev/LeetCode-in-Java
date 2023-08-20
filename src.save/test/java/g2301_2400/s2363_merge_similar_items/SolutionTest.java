package g2301_2400.s2363_merge_similar_items;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeSimilarItems() {
        assertThat(
                new Solution()
                        .mergeSimilarItems(
                                new int[][] {{1, 1}, {4, 5}, {3, 8}}, new int[][] {{3, 1}, {1, 5}}),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(1, 6), Arrays.asList(3, 9), Arrays.asList(4, 5))));
    }

    @Test
    void mergeSimilarItems2() {
        assertThat(
                new Solution()
                        .mergeSimilarItems(
                                new int[][] {{1, 1}, {3, 2}, {2, 3}},
                                new int[][] {{2, 1}, {3, 2}, {1, 3}}),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(1, 4), Arrays.asList(2, 4), Arrays.asList(3, 4))));
    }

    @Test
    void mergeSimilarItems3() {
        assertThat(
                new Solution()
                        .mergeSimilarItems(
                                new int[][] {{1, 3}, {2, 2}}, new int[][] {{7, 1}, {2, 2}, {1, 4}}),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(1, 7), Arrays.asList(2, 4), Arrays.asList(7, 1))));
    }
}
