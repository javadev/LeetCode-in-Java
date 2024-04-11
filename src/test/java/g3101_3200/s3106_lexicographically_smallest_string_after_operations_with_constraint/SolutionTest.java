package g3101_3200.s3106_lexicographically_smallest_string_after_operations_with_constraint;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getSmallestString() {
        assertThat(new Solution().getSmallestString("zbbz", 3), equalTo("aaaz"));
    }

    @Test
    void getSmallestString2() {
        assertThat(new Solution().getSmallestString("xaxcd", 4), equalTo("aawcd"));
    }

    @Test
    void getSmallestString3() {
        assertThat(new Solution().getSmallestString("lol", 0), equalTo("lol"));
    }
}
