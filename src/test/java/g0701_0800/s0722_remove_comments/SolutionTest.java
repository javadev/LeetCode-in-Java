package g0701_0800.s0722_remove_comments;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeComments() {
        String[] input =
                new String[] {
                    "/*Test program */",
                    "int main()",
                    "{ ",
                    "  // variable declaration ",
                    "int a, b, c;",
                    "/* This is a test",
                    "   multiline  ",
                    "   comment for ",
                    "   testing */",
                    "a = b + c;",
                    "}"
                };
        List<String> expected =
                Arrays.asList("int main()", "{ ", "  ", "int a, b, c;", "a = b + c;", "}");
        assertThat(new Solution().removeComments(input), equalTo(expected));
    }

    @Test
    void removeComments2() {
        String[] input = new String[] {"a/*comment", "line", "more_comment*/b"};
        List<String> expected = Collections.singletonList("ab");
        assertThat(new Solution().removeComments(input), equalTo(expected));
    }
}
