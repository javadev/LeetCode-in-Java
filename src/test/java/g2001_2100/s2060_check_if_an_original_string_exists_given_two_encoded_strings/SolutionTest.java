package g2001_2100.s2060_check_if_an_original_string_exists_given_two_encoded_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void possiblyEquals() {
        assertThat(new Solution().possiblyEquals("internationalization", "i18n"), equalTo(true));
    }

    @Test
    void possiblyEquals2() {
        assertThat(new Solution().possiblyEquals("l123e", "44"), equalTo(true));
    }

    @Test
    void possiblyEquals3() {
        assertThat(new Solution().possiblyEquals("a5b", "c5b"), equalTo(false));
    }
}
