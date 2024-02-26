package g2901_3000.s2965_find_missing_and_repeated_values;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMissingAndRepeatedValues() {
        assertThat(
                new Solution().findMissingAndRepeatedValues(new int[][] {{1, 3}, {2, 2}}),
                equalTo(new int[] {2, 4}));
    }

    @Test
    void findMissingAndRepeatedValues2() {
        assertThat(
                new Solution()
                        .findMissingAndRepeatedValues(
                                new int[][] {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}}),
                equalTo(new int[] {9, 5}));
    }
}
