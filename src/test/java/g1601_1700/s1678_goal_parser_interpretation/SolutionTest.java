package g1601_1700.s1678_goal_parser_interpretation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void interpret() {
        assertThat(new Solution().interpret("G()(al)"), equalTo("Goal"));
    }

    @Test
    void interpret2() {
        assertThat(new Solution().interpret("G()()()()(al)"), equalTo("Gooooal"));
    }

    @Test
    void interpret3() {
        assertThat(new Solution().interpret("(al)G(al)()()G"), equalTo("alGalooG"));
    }
}
