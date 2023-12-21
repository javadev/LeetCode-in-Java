package g1101_1200.s1190_reverse_substrings_between_each_pair_of_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseParentheses() {
        assertThat(new Solution().reverseParentheses("(abcd)"), equalTo("dcba"));
    }

    @Test
    void reverseParentheses2() {
        assertThat(new Solution().reverseParentheses("(u(love)i)"), equalTo("iloveu"));
    }

    @Test
    void reverseParentheses3() {
        assertThat(new Solution().reverseParentheses("(ed(et(oc))el)"), equalTo("leetcode"));
    }
}
