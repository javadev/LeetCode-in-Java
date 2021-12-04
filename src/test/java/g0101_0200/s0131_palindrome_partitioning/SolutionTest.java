package g0101_0200.s0131_palindrome_partitioning;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void partition() {
        assertThat(
                new Solution().partition("aab"),
                equalTo(Arrays.asList(Arrays.asList("a", "a", "b"), Arrays.asList("aa", "b"))));
    }
}
