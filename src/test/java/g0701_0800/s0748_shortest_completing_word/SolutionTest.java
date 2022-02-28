package g0701_0800.s0748_shortest_completing_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestCompletingWord() {
        assertThat(
                new Solution()
                        .shortestCompletingWord(
                                "1s3 PSt", new String[] {"step", "steps", "stripe", "stepple"}),
                equalTo("steps"));
    }

    @Test
    void shortestCompletingWord2() {
        assertThat(
                new Solution()
                        .shortestCompletingWord(
                                "1s3 456", new String[] {"looks", "pest", "stew", "show"}),
                equalTo("pest"));
    }
}
