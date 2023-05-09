package g2001_2100.s2065_maximum_path_quality_of_a_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximalPathQuality() {
        assertThat(
                new Solution()
                        .maximalPathQuality(
                                new int[] {0, 32, 10, 43},
                                new int[][] {{0, 1, 10}, {1, 2, 15}, {0, 3, 10}},
                                49),
                equalTo(75));
    }

    @Test
    void maximalPathQuality2() {
        assertThat(
                new Solution()
                        .maximalPathQuality(
                                new int[] {1, 2, 3, 4},
                                new int[][] {{0, 1, 10}, {1, 2, 11}, {2, 3, 12}, {1, 3, 13}},
                                50),
                equalTo(7));
    }

    @Test
    void maximalPathQuality3() {
        assertThat(
                new Solution()
                        .maximalPathQuality(
                                new int[] {5, 10, 15, 20},
                                new int[][] {{0, 1, 10}, {1, 2, 10}, {0, 3, 10}},
                                30),
                equalTo(25));
    }
}
