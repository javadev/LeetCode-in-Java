package g2801_2900.s2828_check_if_a_string_is_an_acronym_of_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isAcronym() {
        assertThat(
                new Solution().isAcronym(Arrays.asList("alice", "bob", "charlie"), "abc"),
                equalTo(true));
    }

    @Test
    void isAcronym2() {
        assertThat(new Solution().isAcronym(Arrays.asList("an", "apple"), "a"), equalTo(false));
    }

    @Test
    void isAcronym3() {
        assertThat(
                new Solution()
                        .isAcronym(
                                Arrays.asList("never", "gonna", "give", "up", "on", "you"),
                                "ngguoy"),
                equalTo(true));
    }
}
