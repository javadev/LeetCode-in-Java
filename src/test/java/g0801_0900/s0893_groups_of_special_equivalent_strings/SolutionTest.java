package g0801_0900.s0893_groups_of_special_equivalent_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSpecialEquivGroups() {
        assertThat(
                new Solution()
                        .numSpecialEquivGroups(
                                new String[] {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"}),
                equalTo(3));
    }

    @Test
    void numSpecialEquivGroups2() {
        assertThat(
                new Solution()
                        .numSpecialEquivGroups(
                                new String[] {"abc", "acb", "bac", "bca", "cab", "cba"}),
                equalTo(3));
    }
}
