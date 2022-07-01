package g1201_1300.s1221_split_a_string_in_balanced_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void balancedStringSplit() {
        assertThat(new Solution().balancedStringSplit("RLRRLLRLRL"), equalTo(4));
    }

    @Test
    void balancedStringSplit2() {
        assertThat(new Solution().balancedStringSplit("RLLLLRRRLR"), equalTo(3));
    }

    @Test
    void balancedStringSplit3() {
        assertThat(new Solution().balancedStringSplit("LLLLRRRR"), equalTo(1));
    }
}
