package g0101_0200.s0126_word_ladder_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
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
                        ArrayUtils.getLists(
                                new String[][] {
                                    {"hit", "hot", "lot", "log", "cog"},
                                    {"hit", "hot", "dot", "dog", "cog"}
                                })));
    }

    @Test
    void findLadders2() {
        assertThat(
                new Solution()
                        .findLadders(
                                "hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log")),
                equalTo(ArrayUtils.getLists(new String[][] {})));
    }
}
