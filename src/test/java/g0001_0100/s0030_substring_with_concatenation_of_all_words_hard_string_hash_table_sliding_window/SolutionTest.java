package g0001_0100.s0030_substring_with_concatenation_of_all_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void findSubstring() {
        assertThat(
                new Solution()
                        .findSubstring("barfoothefoobarman", new String[] {"foo", "bar"})
                        .toString(),
                equalTo("[0, 9]"));
    }
}
