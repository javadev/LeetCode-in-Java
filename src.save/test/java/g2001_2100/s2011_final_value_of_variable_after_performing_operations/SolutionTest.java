package g2001_2100.s2011_final_value_of_variable_after_performing_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void finalValueAfterOperations() {
        assertThat(
                new Solution().finalValueAfterOperations(new String[] {"--X", "X++", "X++"}),
                equalTo(1));
    }

    @Test
    void finalValueAfterOperations2() {
        assertThat(
                new Solution().finalValueAfterOperations(new String[] {"++X", "++X", "X++"}),
                equalTo(3));
    }

    @Test
    void finalValueAfterOperations3() {
        assertThat(
                new Solution().finalValueAfterOperations(new String[] {"X++", "++X", "--X", "X--"}),
                equalTo(0));
    }
}
