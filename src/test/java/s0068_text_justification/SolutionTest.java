package s0068_text_justification;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void textJustification() {
        String[] input =
                new String[] {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> actual = new Solution().fullJustify(input, 16);

        List<String> expected = new ArrayList<>();
        expected.add("This    is    an");
        expected.add("example  of text");
        expected.add("justification.  ");

        for (int i = 0; i < expected.size(); i++) {
            assertThat(actual.get(i), equalTo(expected.get(i)));
        }
    }
}
