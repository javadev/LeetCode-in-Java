package g2401_2500.s2416_sum_of_prefix_scores_of_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumPrefixScores() {
        assertThat(
                new Solution().sumPrefixScores(new String[] {"abc", "ab", "bc", "b"}),
                equalTo(new int[] {5, 4, 3, 2}));
    }

    @Test
    void sumPrefixScores2() {
        assertThat(new Solution().sumPrefixScores(new String[] {"abcd"}), equalTo(new int[] {4}));
    }
}
