package g3901_4000.s3999_minimum_number_of_string_groups_through_transformations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumGroups() {
        assertThat(new Solution().minimumGroups(new String[] {"ntgwz", "zwntg"}), equalTo(1));
    }

    @Test
    void minimumGroups2() {
        assertThat(
                new Solution()
                        .minimumGroups(new String[] {"abc", "cab", "bac", "acb", "bca", "cba"}),
                equalTo(3));
    }

    @Test
    void minimumGroups3() {
        assertThat(
                new Solution()
                        .minimumGroups(
                                new String[] {"leet", "abb", "bab", "deed", "edde", "code", "bba"}),
                equalTo(5));
    }
}
