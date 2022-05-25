package g1001_1100.s1007_minimum_domino_rotations_for_equal_row;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDominoRotations() {
        assertThat(
                new Solution()
                        .minDominoRotations(
                                new int[] {2, 1, 2, 4, 2, 2}, new int[] {5, 2, 6, 2, 3, 2}),
                equalTo(2));
    }

    @Test
    void minDominoRotations2() {
        assertThat(
                new Solution()
                        .minDominoRotations(new int[] {3, 5, 1, 2, 3}, new int[] {3, 6, 3, 3, 4}),
                equalTo(-1));
    }
}
