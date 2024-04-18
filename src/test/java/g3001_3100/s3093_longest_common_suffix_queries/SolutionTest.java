package g3001_3100.s3093_longest_common_suffix_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stringIndices() {
        assertThat(
                new Solution()
                        .stringIndices(
                                new String[] {"abcd", "bcd", "xbcd"},
                                new String[] {"cd", "bcd", "xyz"}),
                equalTo(new int[] {1, 1, 1}));
    }

    @Test
    void stringIndices2() {
        assertThat(
                new Solution()
                        .stringIndices(
                                new String[] {"abcdefgh", "poiuygh", "ghghgh"},
                                new String[] {"gh", "acbfgh", "acbfegh"}),
                equalTo(new int[] {2, 0, 2}));
    }
}
