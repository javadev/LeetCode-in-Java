package g1301_1400.s1370_increasing_decreasing_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortString() {
        assertThat(new Solution().sortString("aaaabbbbcccc"), equalTo("abccbaabccba"));
    }

    @Test
    void sortString2() {
        assertThat(new Solution().sortString("rat"), equalTo("art"));
    }
}
