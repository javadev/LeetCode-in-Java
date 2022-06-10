package g2101_2200.s2193_minimum_number_of_moves_to_make_palindrome;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMovesToMakePalindrome() {
        assertThat(new Solution().minMovesToMakePalindrome("aabb"), equalTo(2));
    }

    @Test
    void minMovesToMakePalindrome2() {
        assertThat(new Solution().minMovesToMakePalindrome("letelt"), equalTo(2));
    }

    @Test
    void minMovesToMakePalindrome3() {
        assertThat(
                new Solution().minMovesToMakePalindrome("skwhhaaunskegmdtutlgtteunmuuludii"),
                equalTo(163));
    }
}
