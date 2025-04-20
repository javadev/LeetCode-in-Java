package g3501_3600.s3524_find_x_value_of_array_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void resultArray() {
        assertThat(
                new Solution().resultArray(new int[] {1, 2, 3, 4, 5}, 3),
                equalTo(new long[] {9L, 2L, 4L}));
    }

    @Test
    void resultArray2() {
        assertThat(
                new Solution().resultArray(new int[] {1, 2, 4, 8, 16, 32}, 4),
                equalTo(new long[] {18L, 1L, 2L, 0L}));
    }

    @Test
    void resultArray3() {
        assertThat(
                new Solution().resultArray(new int[] {1, 1, 2, 1, 1}, 2),
                equalTo(new long[] {9L, 6L}));
    }
}
