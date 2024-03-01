package g1701_1800.s1704_determine_if_string_halves_are_alike;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void halvesAreAlike() {
        assertThat(new Solution().halvesAreAlike("book"), equalTo(true));
    }

    @Test
    void halvesAreAlike2() {
        assertThat(new Solution().halvesAreAlike("textbook"), equalTo(false));
    }

    @Test
    void halvesAreAlike3() {
        assertThat(new Solution().halvesAreAlike(""), equalTo(false));
    }

    @Test
    void halvesAreAlike4() {
        assertThat(new Solution().halvesAreAlike("aeiouAEIOU"), equalTo(true));
    }
}
