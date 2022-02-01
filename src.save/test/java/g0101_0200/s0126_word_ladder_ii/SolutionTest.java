package g0101_0200.s0126_word_ladder_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLadders() {
        assertThat(
                new Solution()
                        .findLadders(
                                "hit",
                                "cog",
                                Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")),
                equalTo(
                        Arrays.asList(
                                Arrays.asList("hit", "hot", "lot", "log", "cog"),
                                Arrays.asList("hit", "hot", "dot", "dog", "cog"))));
    }
}
