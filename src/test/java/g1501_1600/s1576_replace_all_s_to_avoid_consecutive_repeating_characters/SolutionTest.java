package g1501_1600.s1576_replace_all_s_to_avoid_consecutive_repeating_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void modifyString() {
        assertThat(new Solution().modifyString("?zs"), equalTo("azs"));
    }

    @Test
    void modifyString2() {
        assertThat(new Solution().modifyString("ubv?w"), equalTo("ubvaw"));
    }
}
