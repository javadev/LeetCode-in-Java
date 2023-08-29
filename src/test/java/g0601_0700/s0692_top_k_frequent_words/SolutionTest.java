package g0601_0700.s0692_top_k_frequent_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void topKFrequent() {
        assertThat(
                new Solution()
                        .topKFrequent(
                                new String[] {"i", "love", "leetcode", "i", "love", "coding"}, 2),
                equalTo(Arrays.asList("i", "love")));
    }

    @Test
    void topKFrequent2() {
        assertThat(
                new Solution()
                        .topKFrequent(
                                new String[] {
                                    "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is",
                                    "is"
                                },
                                4),
                equalTo(Arrays.asList("the", "is", "sunny", "day")));
    }
}
