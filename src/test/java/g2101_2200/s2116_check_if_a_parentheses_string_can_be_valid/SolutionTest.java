package g2101_2200.s2116_check_if_a_parentheses_string_can_be_valid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canBeValid() {
        assertThat(new Solution().canBeValid("))()))", "010100"), equalTo(true));
    }

    @Test
    void canBeValid2() {
        assertThat(new Solution().canBeValid("()()", "0000"), equalTo(true));
    }

    @Test
    void canBeValid3() {
        assertThat(new Solution().canBeValid(")", "0"), equalTo(false));
    }
}
