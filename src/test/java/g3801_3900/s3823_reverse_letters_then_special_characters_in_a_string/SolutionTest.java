package g3801_3900.s3823_reverse_letters_then_special_characters_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseByType() {
        assertThat(new Solution().reverseByType(")ebc#da@f("), equalTo("(fad@cb#e)"));
    }

    @Test
    void reverseByType2() {
        assertThat(new Solution().reverseByType("z"), equalTo("z"));
    }

    @Test
    void reverseByType3() {
        assertThat(new Solution().reverseByType("!@#$%^&*()"), equalTo(")(*&^%$#@!"));
    }
}
