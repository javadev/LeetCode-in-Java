package g1101_1200.s1128_number_of_equivalent_domino_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numEquivDominoPairs() {
        assertThat(
                new Solution().numEquivDominoPairs(new int[][] {{1, 2}, {2, 1}, {3, 4}, {5, 6}}),
                equalTo(1));
    }

    @Test
    void numEquivDominoPairs2() {
        assertThat(
                new Solution()
                        .numEquivDominoPairs(new int[][] {{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}}),
                equalTo(3));
    }
}
