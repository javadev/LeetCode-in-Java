package g2201_2300.s2201_count_artifacts_that_can_be_extracted;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void digArtifacts() {
        assertThat(
                new Solution()
                        .digArtifacts(
                                2,
                                new int[][] {{0, 0, 0, 0}, {0, 1, 1, 1}},
                                new int[][] {{0, 0}, {0, 1}}),
                equalTo(1));
    }

    @Test
    void digArtifacts2() {
        assertThat(
                new Solution()
                        .digArtifacts(
                                2,
                                new int[][] {{0, 0, 0, 0}, {0, 1, 1, 1}},
                                new int[][] {{0, 0}, {0, 1}, {1, 1}}),
                equalTo(2));
    }
}
