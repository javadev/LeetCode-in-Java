package g2701_2800.s2788_split_strings_by_separator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitWordsBySeparator() {
        List<String> input1 = Arrays.asList("one.two.three", "four.five", "six");
        List<String> expected1 = Arrays.asList("one", "two", "three", "four", "five", "six");
        assertThat(new Solution().splitWordsBySeparator(input1, '.'), equalTo(expected1));
    }

    @Test
    void splitWordsBySeparator2() {
        List<String> input2 = Arrays.asList("$easy$", "$problem$");
        List<String> expected2 = Arrays.asList("easy", "problem");
        assertThat(new Solution().splitWordsBySeparator(input2, '$'), equalTo(expected2));
    }
}
