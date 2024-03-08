package g0101_0200.s0131_palindrome_partitioning;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void partition() {
        assertThat(
                new Solution().partition("aab"),
                equalTo(Arrays.asList(Arrays.asList("a", "a", "b"), Arrays.asList("aa", "b"))));
    }

    @Test
    void partition2() {
        assertThat(
                new Solution().partition("a"),
                equalTo(Collections.singletonList(Collections.singletonList("a"))));
    }
}
