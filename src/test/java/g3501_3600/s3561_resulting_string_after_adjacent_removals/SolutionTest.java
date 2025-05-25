package g3501_3600.s3561_resulting_string_after_adjacent_removals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void resultingString() {
        assertThat(new Solution().resultingString("abc"), equalTo("c"));
    }

    @Test
    void resultingString2() {
        assertThat(new Solution().resultingString("adcb"), equalTo(""));
    }

    @Test
    void resultingString3() {
        assertThat(new Solution().resultingString("zadb"), equalTo("db"));
    }
}
