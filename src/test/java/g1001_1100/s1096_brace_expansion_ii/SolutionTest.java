package g1001_1100.s1096_brace_expansion_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void braceExpansionII() {
        assertThat(
                new Solution().braceExpansionII("{a,b}{c,{d,e}}"),
                equalTo(Arrays.asList("ac", "ad", "ae", "bc", "bd", "be")));
    }

    @Test
    void braceExpansionII2() {
        assertThat(
                new Solution().braceExpansionII("{{a,z},a{b,c},{ab,z}}"),
                equalTo(Arrays.asList("a", "ab", "ac", "z")));
    }
}
