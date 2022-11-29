package g1801_1900.s1844_replace_all_digits_with_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void replaceDigits() {
        assertThat(new Solution().replaceDigits("a1c1e1"), equalTo("abcdef"));
    }

    @Test
    void replaceDigits2() {
        assertThat(new Solution().replaceDigits("a1b2c3d4e"), equalTo("abbdcfdhe"));
    }
}
