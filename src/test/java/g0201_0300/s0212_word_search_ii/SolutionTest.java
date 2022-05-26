package g0201_0300.s0212_word_search_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findWords() {
        char[][] board = {
            {'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> expected = new ArrayList<>();
        expected.add("oath");
        expected.add("eat");
        assertThat(new Solution().findWords(board, words), equalTo(expected));
    }

    @Test
    void findWords2() {
        char[][] board = {{'a', 'b'}, {'c', 'd'}};
        String[] words = {"abcb"};
        assertThat(new Solution().findWords(board, words), equalTo(Collections.emptyList()));
    }
}
