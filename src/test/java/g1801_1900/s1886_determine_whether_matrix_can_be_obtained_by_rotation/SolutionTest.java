package g1801_1900.s1886_determine_whether_matrix_can_be_obtained_by_rotation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findRotation() {
        assertThat(
                new Solution()
                        .findRotation(new int[][] {{0, 1}, {1, 0}}, new int[][] {{1, 0}, {0, 1}}),
                equalTo(true));
    }

    @Test
    void findRotation2() {
        assertThat(
                new Solution()
                        .findRotation(new int[][] {{0, 1}, {1, 1}}, new int[][] {{1, 0}, {0, 1}}),
                equalTo(false));
    }

    @Test
    void findRotation3() {
        assertThat(
                new Solution()
                        .findRotation(
                                new int[][] {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}},
                                new int[][] {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}}),
                equalTo(true));
    }
}
