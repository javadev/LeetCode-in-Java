package s0030.substring.with.concatenation.of.all.words;

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
