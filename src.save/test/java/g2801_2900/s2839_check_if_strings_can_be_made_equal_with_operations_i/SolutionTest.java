package g2801_2900.s2839_check_if_strings_can_be_made_equal_with_operations_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canBeEqual() {
        assertThat(new Solution().canBeEqual("abcd", "cdab"), equalTo(true));
    }

    @Test
    void canBeEqual2() {
        assertThat(new Solution().canBeEqual("abcd", "cdab"), equalTo(true));
    }
}
