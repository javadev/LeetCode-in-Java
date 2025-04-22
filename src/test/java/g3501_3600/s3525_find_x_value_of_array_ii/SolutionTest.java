package g3501_3600.s3525_find_x_value_of_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void resultArray() {
        assertThat(
                new Solution()
                        .resultArray(
                                new int[] {1, 2, 3, 4, 5},
                                3,
                                new int[][] {{2, 2, 0, 2}, {3, 3, 3, 0}, {0, 1, 0, 1}}),
                equalTo(new int[] {2, 2, 2}));
    }

    @Test
    void resultArray2() {
        assertThat(
                new Solution()
                        .resultArray(
                                new int[] {1, 2, 4, 8, 16, 32},
                                4,
                                new int[][] {{0, 2, 0, 2}, {0, 2, 0, 1}}),
                equalTo(new int[] {1, 0}));
    }

    @Test
    void resultArray3() {
        assertThat(
                new Solution()
                        .resultArray(new int[] {1, 1, 2, 1, 1}, 2, new int[][] {{2, 1, 0, 1}}),
                equalTo(new int[] {5}));
    }

    @Test
    void resultArray4() {
        assertThat(
                new Solution().resultArray(new int[] {9, 10, 7}, 1, new int[][] {{0, 8, 1, 0}}),
                equalTo(new int[] {2}));
    }
}
