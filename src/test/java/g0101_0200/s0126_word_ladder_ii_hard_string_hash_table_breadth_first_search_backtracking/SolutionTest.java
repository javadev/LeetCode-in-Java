package g0101_0200.s0126_word_ladder_ii_hard_string_hash_table_breadth_first_search_backtracking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findLadders() {
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
