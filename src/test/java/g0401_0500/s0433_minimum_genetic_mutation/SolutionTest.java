package g0401_0500.s0433_minimum_genetic_mutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMutation() {
        assertThat(
                new Solution().minMutation("AACCGGTT", "AACCGGTA", new String[] {"AACCGGTA"}),
                equalTo(1));
    }

    @Test
    void minMutation2() {
        assertThat(
                new Solution()
                        .minMutation(
                                "AACCGGTT",
                                "AAACGGTA",
                                new String[] {"AACCGGTA", "AACCGCTA", "AAACGGTA"}),
                equalTo(2));
    }

    @Test
    void minMutation3() {
        assertThat(
                new Solution()
                        .minMutation(
                                "AAAAACCC",
                                "AACCCCCC",
                                new String[] {"AAAACCCC", "AAACCCCC", "AACCCCCC"}),
                equalTo(3));
    }
}
