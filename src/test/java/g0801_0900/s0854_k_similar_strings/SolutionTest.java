package g0801_0900.s0854_k_similar_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kSimilarity() {
        assertThat(new Solution().kSimilarity("ab", "ba"), equalTo(1));
    }

    @Test
    void kSimilarity2() {
        assertThat(new Solution().kSimilarity("abc", "bca"), equalTo(2));
    }
}
