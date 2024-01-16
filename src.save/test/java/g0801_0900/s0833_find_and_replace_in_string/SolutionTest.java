package g0801_0900.s0833_find_and_replace_in_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findReplaceString() {
        assertThat(
                new Solution()
                        .findReplaceString(
                                "abcd",
                                new int[] {0, 2},
                                new String[] {"a", "cd"},
                                new String[] {"eee", "ffff"}),
                equalTo("eeebffff"));
    }

    @Test
    void findReplaceString2() {
        assertThat(
                new Solution()
                        .findReplaceString(
                                "abcd",
                                new int[] {0, 2},
                                new String[] {"ab", "ec"},
                                new String[] {"eee", "ffff"}),
                equalTo("eeecd"));
    }
}
