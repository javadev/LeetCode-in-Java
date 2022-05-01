package g0001_0100.s0048_rotate_image;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rotate() {
        int[][] expected = new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        int[][] input = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Solution().rotate(input);
        assertThat(input, equalTo(expected));
    }

    @Test
    void rotate2() {
        int[][] expected =
                new int[][] {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        int[][] input = new int[][] {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        new Solution().rotate(input);
        assertThat(input, equalTo(expected));
    }
}
