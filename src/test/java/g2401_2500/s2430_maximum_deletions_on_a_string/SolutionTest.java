package g2401_2500.s2430_maximum_deletions_on_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void deleteString() {
        assertThat(new Solution().deleteString("abcabcdabc"), equalTo(2));
    }

    @Test
    void deleteString2() {
        assertThat(new Solution().deleteString("aaabaab"), equalTo(4));
    }

    @Test
    void deleteString3() {
        assertThat(new Solution().deleteString("aaaaa"), equalTo(5));
    }
}
