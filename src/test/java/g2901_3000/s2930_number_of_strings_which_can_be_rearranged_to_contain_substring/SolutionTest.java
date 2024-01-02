package g2901_3000.s2930_number_of_strings_which_can_be_rearranged_to_contain_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stringCount() {
        assertThat(new Solution().stringCount(4), equalTo(12));
    }

    @Test
    void stringCount2() {
        assertThat(new Solution().stringCount(10), equalTo(83943898));
    }
}
