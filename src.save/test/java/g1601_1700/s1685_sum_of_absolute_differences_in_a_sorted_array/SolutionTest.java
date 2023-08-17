package g1601_1700.s1685_sum_of_absolute_differences_in_a_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getSumAbsoluteDifferences() {
        assertThat(
                new Solution().getSumAbsoluteDifferences(new int[] {2, 3, 5}),
                equalTo(new int[] {4, 3, 5}));
    }

    @Test
    void getSumAbsoluteDifferences2() {
        assertThat(
                new Solution().getSumAbsoluteDifferences(new int[] {1, 4, 6, 8, 10}),
                equalTo(new int[] {24, 15, 13, 15, 21}));
    }
}
