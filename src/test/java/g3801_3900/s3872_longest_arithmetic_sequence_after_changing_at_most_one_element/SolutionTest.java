package g3801_3900.s3872_longest_arithmetic_sequence_after_changing_at_most_one_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void allowsOneReplacementInEitherDirection() {
        Solution solution = new Solution();

        assertThat(solution.longestArithmetic(new int[] {9, 7, 5, 10, 1}), equalTo(5));
        assertThat(solution.longestArithmetic(new int[] {1, 2, 6, 7}), equalTo(3));
        assertThat(solution.longestArithmetic(new int[] {1, 3, 5, 7}), equalTo(4));
    }
}
