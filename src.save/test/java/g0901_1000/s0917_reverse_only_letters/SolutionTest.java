package g0901_1000.s0917_reverse_only_letters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseOnlyLetters() {
        assertThat(new Solution().reverseOnlyLetters("ab-cd"), equalTo("dc-ba"));
    }

    @Test
    void reverseOnlyLetters2() {
        assertThat(new Solution().reverseOnlyLetters("a-bC-dEf-ghIj"), equalTo("j-Ih-gfE-dCba"));
    }

    @Test
    void reverseOnlyLetters3() {
        assertThat(
                new Solution().reverseOnlyLetters("Test1ng-Leet=code-Q!"),
                equalTo("Qedo1ct-eeLg=ntse-T!"));
    }
}
