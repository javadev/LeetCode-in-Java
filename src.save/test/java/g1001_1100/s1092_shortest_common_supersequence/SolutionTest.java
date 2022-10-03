package g1001_1100.s1092_shortest_common_supersequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestCommonSupersequence() {
        assertThat(new Solution().shortestCommonSupersequence("abac", "cab"), equalTo("cabac"));
    }

    @Test
    void shortestCommonSupersequence2() {
        assertThat(
                new Solution().shortestCommonSupersequence("aaaaaaaa", "aaaaaaaa"),
                equalTo("aaaaaaaa"));
    }
}
