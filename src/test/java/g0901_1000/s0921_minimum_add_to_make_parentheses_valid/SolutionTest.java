package g0901_1000.s0921_minimum_add_to_make_parentheses_valid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAddToMakeValid() {
        assertThat(new Solution().minAddToMakeValid("())"), equalTo(1));
    }

    @Test
    void minAddToMakeValid2() {
        assertThat(new Solution().minAddToMakeValid("((("), equalTo(3));
    }
}
