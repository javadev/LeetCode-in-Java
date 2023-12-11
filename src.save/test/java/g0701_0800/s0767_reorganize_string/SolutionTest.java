package g0701_0800.s0767_reorganize_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reorganizeString() {
        assertThat(new Solution().reorganizeString("aab"), equalTo("aba"));
    }

    @Test
    void reorganizeString2() {
        assertThat(new Solution().reorganizeString("aaab"), equalTo(""));
    }

    @Test
    void reorganizeString3() {
        assertThat(new Solution().reorganizeString("aaabbbb"), equalTo("bababab"));
    }

    @Test
    void reorganizeString4() {
        assertThat(new Solution().reorganizeString("vvvlo"), equalTo("vlvov"));
    }
}
