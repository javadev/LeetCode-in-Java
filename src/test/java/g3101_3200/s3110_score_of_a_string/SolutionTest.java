package g3101_3200.s3110_score_of_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void scoreOfString() {
        assertThat(new Solution().scoreOfString("hello"), equalTo(13));
    }

    @Test
    void scoreOfString2() {
        assertThat(new Solution().scoreOfString("zaz"), equalTo(50));
    }
}
