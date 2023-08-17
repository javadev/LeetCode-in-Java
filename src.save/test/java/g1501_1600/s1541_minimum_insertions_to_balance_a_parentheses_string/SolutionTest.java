package g1501_1600.s1541_minimum_insertions_to_balance_a_parentheses_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minInsertions() {
        assertThat(new Solution().minInsertions("(()))"), equalTo(1));
    }

    @Test
    void minInsertions2() {
        assertThat(new Solution().minInsertions("())"), equalTo(0));
    }

    @Test
    void minInsertions3() {
        assertThat(new Solution().minInsertions("))())("), equalTo(3));
    }
}
