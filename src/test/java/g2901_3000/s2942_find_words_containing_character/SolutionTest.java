package g2901_3000.s2942_find_words_containing_character;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findWordsContaining() {
        assertThat(
                new Solution().findWordsContaining(new String[] {"leet", "code"}, 'e'),
                equalTo(Arrays.asList(0, 1)));
    }

    @Test
    void findWordsContaining2() {
        assertThat(
                new Solution().findWordsContaining(new String[] {"abc", "bcd", "aaaa", "cbc"}, 'a'),
                equalTo(Arrays.asList(0, 2)));
    }

    @Test
    void findWordsContaining3() {
        assertThat(
                new Solution().findWordsContaining(new String[] {"abc", "bcd", "aaaa", "cbc"}, 'z'),
                equalTo(Arrays.asList()));
    }
}
