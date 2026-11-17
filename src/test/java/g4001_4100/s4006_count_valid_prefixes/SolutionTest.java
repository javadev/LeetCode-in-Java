package g4001_4100.s4006_count_valid_prefixes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countValidPrefixes() {
        assertThat(new Solution().countValidPrefixes("00101"), equalTo(3));
    }

    @Test
    void countValidPrefixes2() {
        assertThat(new Solution().countValidPrefixes("101"), equalTo(3));
    }
}
