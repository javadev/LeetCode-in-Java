package g1201_1300.s1249_minimum_remove_to_make_valid_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minRemoveToMakeValid() {
        assertThat(new Solution().minRemoveToMakeValid("lee(t(c)o)de)"), equalTo("lee(t(c)o)de"));
    }

    @Test
    void minRemoveToMakeValid2() {
        assertThat(new Solution().minRemoveToMakeValid("a)b(c)d"), equalTo("ab(c)d"));
    }

    @Test
    void minRemoveToMakeValid3() {
        assertThat(new Solution().minRemoveToMakeValid("))(("), equalTo(""));
    }
}
