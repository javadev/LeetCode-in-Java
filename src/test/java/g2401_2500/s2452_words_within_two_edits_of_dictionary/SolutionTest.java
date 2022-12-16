package g2401_2500.s2452_words_within_two_edits_of_dictionary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void twoEditWords() {
        assertThat(
                new Solution()
                        .twoEditWords(
                                new String[] {"word", "note", "ants", "wood"},
                                new String[] {"wood", "joke", "moat"}),
                equalTo(Arrays.asList("word", "note", "wood")));
    }

    @Test
    void twoEditWords2() {
        assertThat(
                new Solution().twoEditWords(new String[] {"yes"}, new String[] {"not"}),
                equalTo(Collections.emptyList()));
    }
}
