package g1701_1800.s1764_form_array_by_concatenating_subarrays_of_another_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canChoose() {
        assertThat(
                new Solution()
                        .canChoose(
                                new int[][] {{1, -1, -1}, {3, -2, 0}},
                                new int[] {1, -1, 0, 1, -1, -1, 3, -2, 0}),
                equalTo(true));
    }

    @Test
    void canChoose2() {
        assertThat(
                new Solution()
                        .canChoose(
                                new int[][] {{10, -2}, {1, 2, 3, 4}},
                                new int[] {1, 2, 3, 4, 10, -2}),
                equalTo(false));
    }

    @Test
    void canChoose3() {
        assertThat(
                new Solution()
                        .canChoose(
                                new int[][] {{1, 2, 3}, {3, 4}},
                                new int[] {7, 7, 1, 2, 3, 4, 7, 7}),
                equalTo(false));
    }
}
