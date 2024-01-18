package g1401_1500.s1417_reformat_the_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reformat() {
        assertThat(new Solution().reformat("a0b1c2"), equalTo("a0b1c2"));
    }

    @Test
    void reformat2() {
        assertThat(new Solution().reformat("leetcode"), equalTo(""));
    }

    @Test
    void reformat3() {
        assertThat(new Solution().reformat("1229857369"), equalTo(""));
    }
}
