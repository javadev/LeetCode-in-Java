package g0801_0900.s0880_decoded_string_at_index;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void decodeAtIndex() {
        assertThat(new Solution().decodeAtIndex("leet2code3", 10), equalTo("o"));
    }

    @Test
    void decodeAtIndex2() {
        assertThat(new Solution().decodeAtIndex("ha22", 5), equalTo("h"));
    }

    @Test
    void decodeAtIndex3() {
        assertThat(new Solution().decodeAtIndex("a2345678999999999999999", 1), equalTo("a"));
    }
}
