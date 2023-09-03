package g2301_2400.s2351_first_letter_to_appear_twice;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void repeatedCharacter() {
        assertThat(new Solution().repeatedCharacter("abccbaacz"), equalTo('c'));
    }

    @Test
    void repeatedCharacter2() {
        assertThat(new Solution().repeatedCharacter("abcdd"), equalTo('d'));
    }

    @Test
    void repeatedCharacter3() {
        assertThat(new Solution().repeatedCharacter("abcd"), equalTo('0'));
    }
}
