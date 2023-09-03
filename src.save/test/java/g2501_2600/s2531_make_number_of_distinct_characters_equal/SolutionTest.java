package g2501_2600.s2531_make_number_of_distinct_characters_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isItPossible() {
        assertThat(new Solution().isItPossible("ac", "b"), equalTo(false));
    }

    @Test
    void isItPossible2() {
        assertThat(new Solution().isItPossible("abcc", "aab"), equalTo(true));
    }
}
