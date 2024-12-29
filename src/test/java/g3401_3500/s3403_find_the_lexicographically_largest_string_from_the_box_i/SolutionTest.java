package g3401_3500.s3403_find_the_lexicographically_largest_string_from_the_box_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void answerString() {
        assertThat(new Solution().answerString("dbca", 2), equalTo("dbc"));
    }

    @Test
    void answerString2() {
        assertThat(new Solution().answerString("gggg", 4), equalTo("g"));
    }

    @Test
    void answerString3() {
        assertThat(new Solution().answerString("a", 1), equalTo("a"));
    }
}
