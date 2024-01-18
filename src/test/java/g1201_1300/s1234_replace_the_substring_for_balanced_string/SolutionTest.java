package g1201_1300.s1234_replace_the_substring_for_balanced_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void balancedString() {
        assertThat(new Solution().balancedString("QWER"), equalTo(0));
    }

    @Test
    void balancedString2() {
        assertThat(new Solution().balancedString("QQWE"), equalTo(1));
    }

    @Test
    void balancedString3() {
        assertThat(new Solution().balancedString("QQQW"), equalTo(2));
    }
}
