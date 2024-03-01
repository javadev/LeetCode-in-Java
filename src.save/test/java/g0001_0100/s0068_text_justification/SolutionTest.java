package g0001_0100.s0068_text_justification;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fullJustify() {
        String[] input =
                new String[] {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> actual = new Solution().fullJustify(input, 16);
        List<String> expected = new ArrayList<>();
        expected.add("This    is    an");
        expected.add("example  of text");
        expected.add("justification.  ");
        assertThat(actual, equalTo(expected));
    }

    @Test
    void fullJustify2() {
        String[] input = new String[] {"What", "must", "be", "acknowledgment", "shall", "be"};
        List<String> actual = new Solution().fullJustify(input, 16);
        List<String> expected = new ArrayList<>();
        expected.add("What   must   be");
        expected.add("acknowledgment  ");
        expected.add("shall be        ");
        assertThat(actual, equalTo(expected));
    }

    @Test
    void fullJustify3() {
        String[] input =
                new String[] {
                    "Science",
                    "is",
                    "what",
                    "we",
                    "understand",
                    "well",
                    "enough",
                    "to",
                    "explain",
                    "to",
                    "a",
                    "computer.",
                    "Art",
                    "is",
                    "everything",
                    "else",
                    "we",
                    "do"
                };
        List<String> actual = new Solution().fullJustify(input, 20);
        List<String> expected = new ArrayList<>();
        expected.add("Science  is  what we");
        expected.add("understand      well");
        expected.add("enough to explain to");
        expected.add("a  computer.  Art is");
        expected.add("everything  else  we");
        expected.add("do                  ");
        assertThat(actual, equalTo(expected));
    }
}
