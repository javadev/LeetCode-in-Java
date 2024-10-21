package g3301_3400.s3324_find_the_sequence_of_strings_appeared_on_the_screen;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stringSequence() {
        assertThat(
                new Solution().stringSequence("abc"),
                equalTo(List.of("a", "aa", "ab", "aba", "abb", "abc")));
    }

    @Test
    void stringSequence2() {
        assertThat(
                new Solution().stringSequence("he"),
                equalTo(
                        List.of(
                                "a", "b", "c", "d", "e", "f", "g", "h", "ha", "hb", "hc", "hd",
                                "he")));
    }
}
