package g4001_4100.s4002_count_valid_sequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countValidSequences() {
        assertThat(new Solution().countValidSequences(5, 3), equalTo(3));
    }

    @Test
    void countValidSequences2() {
        assertThat(new Solution().countValidSequences(3, 2), equalTo(2));
    }

    @Test
    void countValidSequences3() {
        assertThat(new Solution().countValidSequences(5, 5), equalTo(0));
    }
}
