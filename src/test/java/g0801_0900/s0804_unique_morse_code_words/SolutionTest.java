package g0801_0900.s0804_unique_morse_code_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void uniqueMorseRepresentations() {
        assertThat(
                new Solution()
                        .uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}),
                equalTo(2));
    }

    @Test
    void uniqueMorseRepresentations2() {
        assertThat(new Solution().uniqueMorseRepresentations(new String[] {"a"}), equalTo(1));
    }
}
