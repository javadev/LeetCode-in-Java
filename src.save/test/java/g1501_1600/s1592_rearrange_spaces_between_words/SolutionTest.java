package g1501_1600.s1592_rearrange_spaces_between_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reorderSpaces() {
        assertThat(
                new Solution().reorderSpaces("  this   is  a sentence "),
                equalTo("this   is   a   sentence"));
    }

    @Test
    void reorderSpaces2() {
        assertThat(
                new Solution().reorderSpaces(" practice   makes   perfect"),
                equalTo("practice   makes   perfect "));
    }
}
