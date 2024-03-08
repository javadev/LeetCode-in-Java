package g0001_0100.s0030_substring_with_concatenation_of_all_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSubstring() {
        assertThat(
                new Solution().findSubstring("barfoothefoobarman", new String[] {"foo", "bar"}),
                equalTo(Arrays.asList(0, 9)));
    }

    @Test
    void findSubstring2() {
        assertThat(
                new Solution()
                        .findSubstring(
                                "wordgoodgoodgoodbestword",
                                new String[] {"word", "good", "best", "word"}),
                equalTo(Collections.emptyList()));
    }

    @Test
    void findSubstring3() {
        assertThat(
                new Solution()
                        .findSubstring(
                                "barfoofoobarthefoobarman", new String[] {"bar", "foo", "the"}),
                equalTo(Arrays.asList(6, 9, 12)));
    }
}
