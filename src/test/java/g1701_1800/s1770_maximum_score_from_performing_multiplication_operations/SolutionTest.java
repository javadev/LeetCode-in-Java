package g1701_1800.s1770_maximum_score_from_performing_multiplication_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumScore() {
        assertThat(
                new Solution().maximumScore(new int[] {1, 2, 3}, new int[] {3, 2, 1}), equalTo(14));
    }

    @Test
    void maximumScore2() {
        assertThat(
                new Solution()
                        .maximumScore(
                                new int[] {-5, -3, -3, -2, 7, 1}, new int[] {-10, -5, 3, 4, 6}),
                equalTo(102));
    }
}
