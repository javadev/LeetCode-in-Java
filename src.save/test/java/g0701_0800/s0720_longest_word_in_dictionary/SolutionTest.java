package g0701_0800.s0720_longest_word_in_dictionary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestWord() {
        assertThat(
                new Solution().longestWord(new String[] {"w", "wo", "wor", "worl", "world"}),
                equalTo("world"));
    }

    @Test
    void longestWord2() {
        assertThat(
                new Solution()
                        .longestWord(
                                new String[] {
                                    "a", "banana", "app", "appl", "ap", "apply", "apple"
                                }),
                equalTo("apple"));
    }
}
