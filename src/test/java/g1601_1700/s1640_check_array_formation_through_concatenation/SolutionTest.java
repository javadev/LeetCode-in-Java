package g1601_1700.s1640_check_array_formation_through_concatenation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canFormArray() {
        assertThat(
                new Solution().canFormArray(new int[] {15, 88}, new int[][] {{88}, {15}}),
                equalTo(true));
    }

    @Test
    void canFormArray2() {
        assertThat(
                new Solution().canFormArray(new int[] {49, 18, 16}, new int[][] {{16, 18, 49}}),
                equalTo(false));
    }

    @Test
    void canFormArray3() {
        assertThat(
                new Solution()
                        .canFormArray(new int[] {91, 4, 64, 78}, new int[][] {{78}, {4, 64}, {91}}),
                equalTo(true));
    }
}
