package g2101_2200.s2157_groups_of_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void groupStrings() {
        assertThat(
                new Solution().groupStrings(new String[] {"a", "b", "ab", "cde"}),
                equalTo(new int[] {2, 3}));
    }

    @Test
    void groupStrings2() {
        assertThat(
                new Solution().groupStrings(new String[] {"a", "ab", "abc"}),
                equalTo(new int[] {1, 3}));
    }
}
