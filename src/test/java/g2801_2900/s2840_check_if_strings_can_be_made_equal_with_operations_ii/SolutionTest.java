package g2801_2900.s2840_check_if_strings_can_be_made_equal_with_operations_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkStrings() {
        assertThat(new Solution().checkStrings("abcdba", "cabdab"), equalTo(true));
    }

    @Test
    void checkStrings2() {
        assertThat(new Solution().checkStrings("abe", "bea"), equalTo(false));
    }
}
