package g0101_0200.s0127_word_ladder;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void ladderLength() {
        assertThat(
                new Solution()
                        .ladderLength(
                                "hit",
                                "cog",
                                Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")),
                equalTo(5));
    }
}
