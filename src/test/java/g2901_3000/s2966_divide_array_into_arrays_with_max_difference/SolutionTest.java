package g2901_3000.s2966_divide_array_into_arrays_with_max_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void divideArray() {
        assertThat(
                new Solution().divideArray(new int[] {1, 3, 4, 8, 7, 9, 3, 5, 1}, 2),
                equalTo(new int[][] {{1, 1, 3}, {3, 4, 5}, {7, 8, 9}}));
    }

    @Test
    void divideArray2() {
        assertThat(
                new Solution().divideArray(new int[] {1, 3, 3, 2, 7, 3}, 3),
                equalTo(new int[][] {}));
    }
}
