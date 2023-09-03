package g1501_1600.s1513_number_of_substrings_with_only_1s;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSub() {
        assertThat(new Solution().numSub("0110111"), equalTo(9));
    }

    @Test
    void numSub2() {
        assertThat(new Solution().numSub("101"), equalTo(2));
    }

    @Test
    void numSub3() {
        assertThat(new Solution().numSub("111111"), equalTo(21));
    }
}
