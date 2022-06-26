package g0901_1000.s0990_satisfiability_of_equality_equations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void equationsPossible() {
        assertThat(new Solution().equationsPossible(new String[] {"a==b", "b!=a"}), equalTo(false));
    }

    @Test
    void equationsPossible2() {
        assertThat(new Solution().equationsPossible(new String[] {"b==a", "a==b"}), equalTo(true));
    }
}
