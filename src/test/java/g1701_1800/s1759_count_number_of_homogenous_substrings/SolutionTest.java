package g1701_1800.s1759_count_number_of_homogenous_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countHomogenous() {
        assertThat(new Solution().countHomogenous("abbcccaa"), equalTo(13));
    }

    @Test
    void countHomogenous2() {
        assertThat(new Solution().countHomogenous("xy"), equalTo(2));
    }

    @Test
    void countHomogenous3() {
        assertThat(new Solution().countHomogenous("zzzzz"), equalTo(15));
    }
}
