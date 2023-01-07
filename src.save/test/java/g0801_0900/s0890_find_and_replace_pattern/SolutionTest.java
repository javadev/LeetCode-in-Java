package g0801_0900.s0890_find_and_replace_pattern;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findAndReplacePattern() {
        assertThat(
                new Solution()
                        .findAndReplacePattern(
                                new String[] {"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"),
                equalTo(Arrays.asList("mee", "aqq")));
    }

    @Test
    void findAndReplacePattern2() {
        assertThat(
                new Solution().findAndReplacePattern(new String[] {"a", "b", "c"}, "a"),
                equalTo(Arrays.asList("a", "b", "c")));
    }
}
