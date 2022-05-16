package g1901_2000.s1938_maximum_genetic_difference_query;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxGeneticDifference() {
        assertThat(
                new Solution()
                        .maxGeneticDifference(
                                new int[] {-1, 0, 1, 1}, new int[][] {{0, 2}, {3, 2}, {2, 5}}),
                equalTo(new int[] {2, 3, 7}));
    }

    @Test
    void maxGeneticDifference2() {
        assertThat(
                new Solution()
                        .maxGeneticDifference(
                                new int[] {3, 7, -1, 2, 0, 7, 0, 2},
                                new int[][] {{4, 6}, {1, 15}, {0, 5}}),
                equalTo(new int[] {6, 14, 7}));
    }
}
