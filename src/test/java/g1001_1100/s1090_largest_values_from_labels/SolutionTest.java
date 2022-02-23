package g1001_1100.s1090_largest_values_from_labels;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestValsFromLabels() {
        assertThat(
                new Solution()
                        .largestValsFromLabels(
                                new int[] {5, 4, 3, 2, 1}, new int[] {1, 1, 2, 2, 3}, 3, 1),
                equalTo(9));
    }

    @Test
    void largestValsFromLabels2() {
        assertThat(
                new Solution()
                        .largestValsFromLabels(
                                new int[] {5, 4, 3, 2, 1}, new int[] {1, 3, 3, 3, 2}, 3, 2),
                equalTo(12));
    }
}
