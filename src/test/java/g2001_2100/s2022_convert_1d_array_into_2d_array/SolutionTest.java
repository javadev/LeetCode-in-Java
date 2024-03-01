package g2001_2100.s2022_convert_1d_array_into_2d_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void construct2DArray() {
        assertThat(
                new Solution().construct2DArray(new int[] {1, 2, 3, 4}, 2, 2),
                equalTo(new int[][] {{1, 2}, {3, 4}}));
    }

    @Test
    void construct2DArray2() {
        assertThat(
                new Solution().construct2DArray(new int[] {1, 2, 3}, 1, 3),
                equalTo(new int[][] {{1, 2, 3}}));
    }

    @Test
    void construct2DArray3() {
        assertThat(
                new Solution().construct2DArray(new int[] {1, 2}, 1, 1), equalTo(new int[][] {}));
    }
}
