package g2201_2300.s2287_rearrange_characters_to_make_target_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rearrangeCharacters() {
        assertThat(new Solution().rearrangeCharacters("abcba", "abc"), equalTo(1));
    }

    @Test
    void rearrangeCharacters2() {
        assertThat(new Solution().rearrangeCharacters("abbaccaddaeea", "aaaaa"), equalTo(1));
    }
}
