package g2701_2800.s2781_length_of_the_longest_valid_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestValidSubstring() {
        List<String> forbidden1 = new ArrayList<>();
        forbidden1.add("aaa");
        forbidden1.add("cb");
        assertThat(new Solution().longestValidSubstring("cbaaaabc", forbidden1), equalTo(4));
    }

    @Test
    void longestValidSubstring2() {
        List<String> forbidden2 = new ArrayList<>();
        forbidden2.add("de");
        forbidden2.add("le");
        forbidden2.add("e");
        assertThat(new Solution().longestValidSubstring("leetcode", forbidden2), equalTo(4));
    }
}
