package g1501_1600.s1525_number_of_good_ways_to_split_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSplits() {
        assertThat(new Solution().numSplits("aacaba"), equalTo(2));
    }

    @Test
    void numSplits2() {
        assertThat(new Solution().numSplits("abcd"), equalTo(1));
    }
}
