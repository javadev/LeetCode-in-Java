package g0801_0900.s0839_similar_string_groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSimilarGroups() {
        assertThat(
                new Solution().numSimilarGroups(new String[] {"tars", "rats", "arts", "star"}),
                equalTo(2));
    }

    @Test
    void numSimilarGroups2() {
        assertThat(new Solution().numSimilarGroups(new String[] {"omv", "ovm"}), equalTo(1));
    }
}
