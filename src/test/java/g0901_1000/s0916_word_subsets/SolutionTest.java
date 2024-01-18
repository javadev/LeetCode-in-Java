package g0901_1000.s0916_word_subsets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void wordSubsets() {
        assertThat(
                new Solution()
                        .wordSubsets(
                                new String[] {"amazon", "apple", "facebook", "google", "leetcode"},
                                new String[] {"e", "o"}),
                equalTo(Arrays.asList("facebook", "google", "leetcode")));
    }

    @Test
    void wordSubsets2() {
        assertThat(
                new Solution()
                        .wordSubsets(
                                new String[] {"amazon", "apple", "facebook", "google", "leetcode"},
                                new String[] {"l", "e"}),
                equalTo(Arrays.asList("apple", "google", "leetcode")));
    }
}
