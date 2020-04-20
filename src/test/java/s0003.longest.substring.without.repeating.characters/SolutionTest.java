package s0003.longest.substring.without.repeating.characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void lengthOfLongestSubstring() {
        assertThat(new Solution().lengthOfLongestSubstring("abcabcbb"), equalTo(3));
    }
}
