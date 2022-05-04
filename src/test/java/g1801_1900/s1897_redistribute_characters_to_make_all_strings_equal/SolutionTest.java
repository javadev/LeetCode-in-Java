package g1801_1900.s1897_redistribute_characters_to_make_all_strings_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeEqual() {
        assertThat(new Solution().makeEqual(new String[] {"abc", "aabc", "bc"}), equalTo(true));
    }

    @Test
    void makeEqual2() {
        assertThat(new Solution().makeEqual(new String[] {"ab", "a"}), equalTo(false));
    }
}
