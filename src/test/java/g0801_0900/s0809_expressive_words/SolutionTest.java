package g0801_0900.s0809_expressive_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void expressiveWords() {
        assertThat(
                new Solution().expressiveWords("heeellooo", new String[] {"hello", "hi", "helo"}),
                equalTo(1));
    }

    @Test
    void expressiveWords2() {
        assertThat(
                new Solution().expressiveWords("zzzzzyyyyy", new String[] {"zzyy", "zy", "zyy"}),
                equalTo(3));
    }
}
