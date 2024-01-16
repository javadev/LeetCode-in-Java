package g0501_0600.s0524_longest_word_in_dictionary_through_deleting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLongestWord() {
        assertThat(
                new Solution()
                        .findLongestWord(
                                "abpcplea", Arrays.asList("ale", "apple", "monkey", "plea")),
                equalTo("apple"));
    }

    @Test
    void findLongestWord2() {
        assertThat(
                new Solution().findLongestWord("abpcplea", Arrays.asList("a", "b", "c")),
                equalTo("a"));
    }
}
