package g4001_4100.s4002_count_valid_sequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void test() {
        assertThat(new Solution().decode(""), equalTo(""));
    }
}
