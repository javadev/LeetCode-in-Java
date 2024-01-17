package g2901_3000.s3000_maximum_area_of_longest_diagonal_rectangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void areaOfMaxDiagonal() {
        assertThat(new Solution().areaOfMaxDiagonal(new int[][] {{9, 3}, {8, 6}}), equalTo(48));
    }

    @Test
    void areaOfMaxDiagonal2() {
        assertThat(new Solution().areaOfMaxDiagonal(new int[][] {{3, 4}, {4, 3}}), equalTo(12));
    }
}
